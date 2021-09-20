import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  apiurl="http://localhost:8080";

  constructor(private http: HttpClient) { }

  public postLogin(user:any): Observable<any> {
    //const headers = new HttpHeaders().set('Content-Type', 'application/json').set('Connection','keep-alive').set('Accept-Encoding','gzip, deflate, br');
    
    return this.http.post<any>(this.apiurl + '/auth/login', user );
  }
}
