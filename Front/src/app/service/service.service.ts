import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor( private http: HttpClient ) { }

  todos(){
    return this.http.get<any[]>("http://localhost:8001/oferta/todos")
  }
}
