import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Note } from '../entities/Note';

@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(
    private http: HttpClient
  ) { 
    
  }

  url='http://localhost:8080/NotifyRest/notes';

  getNotes() {
    return this.http.get<Note[]>(this.url);
  }
}
