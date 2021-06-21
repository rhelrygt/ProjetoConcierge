import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Coordenador } from '../models/coordenador';

@Injectable({
  providedIn: 'root'
})
export class CoordenadorService {
  apiurl = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  public postusuario(coordenador: Coordenador): Observable<any> {
    return this.http.post(this.apiurl + '/coordenador/save', coordenador);
  }
  public getUsuario(id: number): Observable<any> {
    return this.http.get(this.apiurl + '/coordenador/findbyid/' + id);
  }
}
