import { Observable } from 'rxjs';
import { Aluno } from './../models/aluno';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AlunoService {
  apiurl = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  public postusuario(aluno: Aluno): Observable<any> {
    return this.http.post(this.apiurl + '/aluno/save', aluno);
  }
  public getUsuario(id: number): Observable<any> {
    return this.http.get(this.apiurl + '/usuario/findbyid/' + id);
  }
}
