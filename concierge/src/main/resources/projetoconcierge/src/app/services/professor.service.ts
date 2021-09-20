import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Professor } from '../models/professor';

@Injectable({
  providedIn: 'root'
})
export class ProfessorService {
  apiurl = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  public postusuario(professor: Professor): Observable<any> {
    return this.http.post(this.apiurl + '/professor/save', professor);
  }
  public getUsuario(id: number): Observable<any> {
    return this.http.get(this.apiurl + '/professor/findbyid/' + id);
  }
  public getAll(): Observable<any> {
    return this.http.get(this.apiurl + '/professor/findAll');
  }
}
