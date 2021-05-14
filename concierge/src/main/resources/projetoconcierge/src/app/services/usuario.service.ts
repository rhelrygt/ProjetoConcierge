import { Usuario } from './../models/usuario';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  apiurl="http://localhost:8080";

constructor(private http: HttpClient) { }

public postusuario(usuario:Usuario):Observable<any>{
  return this.http.post(this.apiurl+'/usuario/save',usuario);
}
public getUsuario(id: number):Observable<any>{
  return this.http.get(this.apiurl+'/usuario/findbyid/'+id);
}

}
