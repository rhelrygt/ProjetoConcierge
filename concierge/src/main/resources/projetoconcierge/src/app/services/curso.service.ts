import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Curso } from '../models/curso';

@Injectable({
  providedIn: 'root'
})
export class CursoService {
  apiurl = "http://localhost:8080";


  constructor(private http: HttpClient) { }

  public postCurso(curso: Curso): Observable<any> {
    return this.http.post(this.apiurl + '/curso/save', curso);
  }
  public getCurso(id: number): Observable<any> {
    return this.http.get(this.apiurl + '/curso/findbyid/' + id);
  }
}
