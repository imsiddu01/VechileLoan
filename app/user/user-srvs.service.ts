import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './User';


@Injectable({
  providedIn: 'root'
})
export class UserSrvsService {

  private baseUrl="http://localhost:8090/user";


  constructor(private http:HttpClient) { }


  //Display all users
  public listAllUsers(){
    console.log(this.http.get<any[]>(this.baseUrl+'/users')); 
    
    return this.http.get<any[]>(this.baseUrl+'/users');
  
    }


    // Search all users by Id
    public getUserById(id:number)

  {

    console.log(this.http.get<any>(this.baseUrl+'/userid/'+id));

    return this.http.get<any>(this.baseUrl+'/userid/'+id);

  }

  // Add new users
  public createUser(user: User)
  {
    //console.log(this.http.post(this.baseUrl+'/addUser'/));
    return this.http.post(this.baseUrl+'/addUser/',user)
   
  }


}
