import { CommonModule } from '@angular/common';
import { AfterViewInit, Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { Auth, signOut } from '@angular/fire/auth';
import { Router } from '@angular/router';
import { DataService } from './DataService';
import { Category, Subcategory, Problem } from './dashboard.types';
import { FormsModule } from '@angular/forms';
import { NgbProgressbarModule } from '@ng-bootstrap/ng-bootstrap';
declare var bootstrap: any;

@Component({
  selector: 'app-dashboard',
  standalone: true,
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
  imports: [CommonModule, FormsModule, NgbProgressbarModule, RouterModule]
})
export class DashboardComponent implements AfterViewInit {

  dashboardData: Category[] = [];
  filteredData: Category[] = [];
  selectedSubcategoryIndex: number | null = null;
  activeCategory: number = 999;
  activeSubCategory: number = 999;
  levels: number[] = Array.from({ length: 8 }, (_, i) => i + 1);

  constructor(private auth: Auth, private router: Router, private dataService: DataService) { }

  ngOnInit() {
    this.loadFromLocalStorage();
    if (!this.filteredData.length) {
      this.loadData();
    }
    // this.dataService.getDocuments().subscribe(data => {
    //   debugger
    // });
  }

  ngAfterViewInit() {
    // Initialize all accordions
    document.querySelectorAll('.accordion-collapse').forEach((collapse) => {
      new bootstrap.Collapse(collapse, {
        toggle: false
      });
    });
  }

  loadData() {
    this.dataService.getData().subscribe(
      (data: Category[]) => {
        this.dashboardData = data;
        this.filteredData = data;
        this.activeCategory = 0;
        this.activeSubCategory = 0;
        this.saveToLocalStorage();
        console.log('Dashboard data loaded:', this.dashboardData);
      },
      error => {
        console.error('Error loading dashboard data:', error);
      }
    );
  }

  filterSubcategories() {
    if (this.selectedSubcategoryIndex === null) {
      this.filteredData = this.dashboardData;
    } else {
      this.filteredData = this.dashboardData.map(category => {

        let filteredSubcategories: Subcategory[] = [];

        if (category.category_id === "extras") {
          if (this.selectedSubcategoryIndex != null && this.selectedSubcategoryIndex < 1) {
            filteredSubcategories = category.subcategories;
          }
        } else {
          filteredSubcategories = category.subcategories.filter((_, index) => index === this.selectedSubcategoryIndex);
        }

        debugger

        return {
          ...category,
          subcategories: filteredSubcategories,
          selected: filteredSubcategories.length > 0 && filteredSubcategories.every(subcategory =>
            subcategory.problems.every(problem => problem.selected)
          )
        };
      }).filter(category => category.subcategories.length > 0);
    }

    // Update subcategory selected state based on its problems
    this.filteredData.forEach((category, i) => {
      debugger
      if (!category.selected) {
        this.activeCategory = Math.min(i, this.activeCategory);
      }
      category.subcategories.forEach((subcategory, j) => {
        subcategory.selected = subcategory.problems.every(problem => problem.selected);
        if (!subcategory.selected && this.activeSubCategory === 999) {
          this.activeSubCategory = j;
        }
      });
    });

    this.saveToLocalStorage();
  }

  getTotalProblems(): number {
    return this.dashboardData.reduce((total, category) =>
      total + this.getTotalProblemsInCategory(category), 0);
  }

  getTotalCompletedProblems(): number {
    return this.dashboardData.reduce((total, category) =>
      total + this.getCompletedProblemsInCategory(category), 0);
  }

  getCompletionPercentage(): string {
    const total = this.getTotalProblems();
    const completed = this.getTotalCompletedProblems();
    return total > 0 ? ((completed / total) * 100).toFixed(2) : '0.00';
  }

  getTotalProblemsAtLevel(): number {
    return this.filteredData.reduce((total, category) =>
      total + this.getTotalProblemsInCategory(category), 0);
  }

  getTotalCompletedProblemsAtLevel(): number {
    return this.filteredData.reduce((total, category) =>
      total + this.getCompletedProblemsInCategory(category), 0);
  }

  getCompletionPercentageAtLevel(): string {
    const total = this.getTotalProblemsAtLevel();
    const completed = this.getTotalCompletedProblemsAtLevel();
    return total > 0 ? ((completed / total) * 100).toFixed(2) : '0.00';
  }

  getPercentage(total: number, completed: number): number {
    return total > 0 ? Math.ceil((completed / total) * 100) : 0;
  }

  getTotalProblemsInCategory(category: Category): number {
    return category.subcategories.reduce((total, subcategory) =>
      total + subcategory.problems.length, 0);
  }

  getCompletedProblemsInCategory(category: Category): number {
    return category.subcategories.reduce((total, subcategory) =>
      total + subcategory.problems.filter(problem => problem.selected).length, 0);
  }

  getCompletedSubcategoriesInCategory(category: Category): number {
    return category.subcategories.filter(subcategory => subcategory.selected).length;
  }

  getCompletedProblemsInSubcategory(subcategory: Subcategory): number {
    return subcategory.problems.filter(problem => problem.selected).length;
  }

  onCategoryChange(categoryIndex: number) {
    const category = this.filteredData[categoryIndex];
    category.subcategories.forEach(subcategory => {
      subcategory.selected = category.selected;
      subcategory.problems.forEach(problem => problem.selected = category.selected);
    });
    this.saveToLocalStorage();
  }

  onSubcategoryChange(categoryIndex: number, subcategoryIndex: number) {
    const subcategory = this.filteredData[categoryIndex].subcategories[subcategoryIndex];
    subcategory.problems.forEach(problem => problem.selected = subcategory.selected);
    this.updateCategorySelection(categoryIndex);
    this.saveToLocalStorage();
  }


  onProblemChange(categoryIndex: number, subcategoryIndex: number, problemIndex: number) {
    this.updateSubcategorySelection(categoryIndex, subcategoryIndex);
    this.updateCategorySelection(categoryIndex);
    this.saveToLocalStorage();
  }

  private saveToLocalStorage() {
    // this.dashboardData.forEach((category: Category) => {
    //   this.dataService.addDocument(category).subscribe(
    //     newId => console.log('New category added with ID:', newId),
    //     error => console.error('Error adding category:', error)
    //   );
    // });
    localStorage.setItem('dashboardData', JSON.stringify(this.dashboardData));
    localStorage.setItem('selectedSubcategoryIndex', JSON.stringify(this.selectedSubcategoryIndex));
  }

  private loadFromLocalStorage() {
    const saveddashboardData = localStorage.getItem('dashboardData');
    if (saveddashboardData) {
      this.filteredData = JSON.parse(saveddashboardData);
      this.dashboardData = this.filteredData;
    }

    const savedSelectedSubcategoryIndex = localStorage.getItem('selectedSubcategoryIndex');
    if (savedSelectedSubcategoryIndex) {
      this.selectedSubcategoryIndex = JSON.parse(savedSelectedSubcategoryIndex);
    }

    this.filterSubcategories();
  }

  private updateSubcategorySelection(categoryIndex: number, subcategoryIndex: number) {
    const subcategory = this.filteredData[categoryIndex].subcategories[subcategoryIndex];
    subcategory.selected = subcategory.problems.every(problem => problem.selected);
  }

  private updateCategorySelection(categoryIndex: number) {
    const category = this.filteredData[categoryIndex];
    category.selected = category.subcategories.every(subcategory => subcategory.selected);
  }

  logout() {
    signOut(this.auth).then(() => {
      this.router.navigate(['/login']);
    });
  }
}