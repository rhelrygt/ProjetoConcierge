import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Turma } from '../models/turma';

@Injectable({
  providedIn: 'root'
})
export class TurmaService {
  apiurl = "http://localhost:8080";


  constructor(private http: HttpClient) { }

  public postTurma(turma: Turma): Observable<any> {
    return this.http.post(this.apiurl + '/turma/save', turma);
  }

  public getCurso(id: number): Observable<any> {
    return this.http.get(this.apiurl + '/turma/findbyid/' + id);
  }

  public getTurmaList(): Observable<any> {
    return this.http.get(this.apiurl + '/turma/findAll');
  }

  public getTurmaListByProfessor(id:number): Observable<any> {
    return this.http.get(this.apiurl + '/turma/findbyprofessor/'+id);
  }

  public getTurmaListByAluno(id:number): Observable<any> {
    return this.http.get(this.apiurl + '/turma/findbyaluno/'+id);
  }


}
