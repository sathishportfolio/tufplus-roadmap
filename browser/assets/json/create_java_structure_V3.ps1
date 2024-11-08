# Read the JSON file
$jsonContent = Get-Content -Path ".\all_syllabus.json" -Raw | ConvertFrom-Json

# Delete and recreate the root folder
$rootFolder = "all_syllabus"
if (Test-Path $rootFolder) { Remove-Item -Path $rootFolder -Recurse -Force }
New-Item -Path $rootFolder -ItemType Directory -Force | Out-Null

# Function to convert kebab-case to PascalCase
function ConvertTo-PascalCase($inputString) {
    return (($inputString -split '[^a-zA-Z0-9]+' | Where-Object { $_ }) | ForEach-Object { $_.Substring(0,1).ToUpper() + $_.Substring(1).ToLower() }) -join ''
}

# Function to create Java file content
function Get-JavaFileContent($packageName, $category, $subcategory, $problem, $solutionType, $className) {
    return @"
package $packageName;

import java.util.Arrays;
/**
 * Category: $($category.category_name)
 * Subcategory: $($subcategory.subcategory_name)
 * Problem: $($problem.problem_name)
 */
public class $className {

    // Solution : $solutionType Approach - $($problem.problem_name)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr);
    }

    public static void solution(int[] arr) {
        System.out.println("\n $($problem.problem_name) - $solutionType Approach : " + Arrays.toString(arr));
    }
}
"@
}

# Function to create folders and files
function Create-FoldersAndFiles($levelName, $category, $subcategory, $problem, $isRank1 = $false) {
    try {
        $categorySlug = ConvertTo-PascalCase $category.category_slug
        $problemSlug = ConvertTo-PascalCase $problem.problem_slug

        if ($isRank1) {
            $subcategorySlug = ConvertTo-PascalCase $subcategory.subcategory_slug
            $folderPath = [System.IO.Path]::Combine($rootFolder, $levelName, "C1_$categorySlug", "S$($subcategory.subcategory_rank)_$subcategorySlug", "P$($problem.problem_rank)_$problemSlug", "Revision1")
            $packageName = "$levelName.C1_$categorySlug.S$($subcategory.subcategory_rank)_$subcategorySlug.P$($problem.problem_rank)_$problemSlug.Revision1"
        } else {
            $folderPath = [System.IO.Path]::Combine($rootFolder, $levelName, "C$($category.category_rank)_$categorySlug", "P$($problem.problem_rank)_$problemSlug", "Revision1")
            $packageName = "$levelName.C$($category.category_rank)_$categorySlug.P$($problem.problem_rank)_$problemSlug.Revision1"
        }

        New-Item -Path $folderPath -ItemType Directory -Force | Out-Null

        $solutionTypes = @("Brute", "Better", "Optimal")
        foreach ($i in 1..3) {
            $className = "A${i}_$($solutionTypes[$i-1])_$problemSlug"
            $filePath = [System.IO.Path]::Combine($folderPath, "$className.java")
            $javaContent = Get-JavaFileContent $packageName $category $subcategory $problem $solutionTypes[$i-1] $className
            Set-Content -Path $filePath -Value $javaContent -Force
        }
    }
    catch {
        Write-Error "Error in Create-FoldersAndFiles: $_"
        Write-Host "Debug Info:"
        Write-Host "  levelName: $levelName"
        Write-Host "  category: $($category | ConvertTo-Json -Compress)"
        Write-Host "  subcategory: $($subcategory | ConvertTo-Json -Compress)"
        Write-Host "  problem: $($problem | ConvertTo-Json -Compress)"
        Write-Host "  isRank1: $isRank1"
    }
}

# Process category_rank=1
$rank1Category = $jsonContent.all_syllabus | Where-Object { $_.category_rank -eq 1 }
if ($rank1Category) {
    foreach ($subcategory in $rank1Category.subcategories) {
        foreach ($problem in $subcategory.problems) {
            Create-FoldersAndFiles "Level1" $rank1Category $subcategory $problem $true
        }
    }
}

# Process other categories
for ($level = 1; $level -le 10; $level++) {
    $levelName = "Level$level"
    foreach ($category in $jsonContent.all_syllabus | Where-Object { $_.category_rank -ne 1 }) {
        if ($category.subcategories.Count -gt ($level - 1)) {
            $subcategory = $category.subcategories[$level - 1]
            foreach ($problem in $subcategory.problems) {
                Create-FoldersAndFiles $levelName $category $subcategory $problem
            }
        }
    }
}

Write-Host "Folder structure created successfully."