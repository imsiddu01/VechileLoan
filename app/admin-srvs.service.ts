import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Admin } from './admin/Admin';

@Injectable({
  providedIn: 'root'
})
export class AdminSrvsService {

  private baseUrl="http://localhost:8090/admin";

  constructor(private http:HttpClient) { }



  public createAdmin(admin: Admin)
  {
    //console.log(this.http.post(this.baseUrl+'/addUser'/));
    return this.http.post(this.baseUrl+'/addAdmin/',admin)
   
  }
}
