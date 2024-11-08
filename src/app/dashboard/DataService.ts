import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import { AngularFirestore, DocumentReference } from '@angular/fire/compat/firestore';
import { User } from './user.model';
import { Firestore, addDoc, collection, collectionData, query, where } from '@angular/fire/firestore';
import { Category } from './dashboard.types';

@Injectable({
    providedIn: 'root'
})
export class DataService {
    constructor(private firestore: Firestore, private http: HttpClient) { }

    addDocument(category: Category): Observable<string> {
        const categoryCollection = collection(this.firestore, 'categories');
        return from(addDoc(categoryCollection, category).then(docRef => docRef.id));
    }

    getDocuments(): Observable<Category[]> {
        const categoryCollection = collection(this.firestore, 'categories');
        return collectionData(query(categoryCollection)) as Observable<Category[]>;
    }

    getData(): Observable<any> {
        return this.http.get('assets/json/data_all.json');
    }
}