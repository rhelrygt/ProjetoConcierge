import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Curso } from '../models/curso';
import { Historico } from '../models/historico';

@Injectable({
  providedIn: 'root'
})
export class HistoricoService {
  apiurl = "http://localhost:8080";


  constructor(private http: HttpClient) { }

  public postHistorico(historico: Historico): Observable<any> {
    return this.http.post(this.apiurl + '/historico/save', historico);
  }

  public getHistorico(id: number): Observable<any> {
    return this.http.get(this.apiurl + '/historico/findbyid/' + id);
  }

  public getHistoricoByTurma(id:number): Observable<any> {
    return this.http.get(this.apiurl + '/historico/findbyturma/'+id);
  }


}
