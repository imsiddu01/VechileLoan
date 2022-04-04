import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Loan } from './Loan';

@Injectable({
  providedIn: 'root'
})
export class LoanSrvsService {
  private baseUrl="http://localhost:8090/loan";


  constructor(private http:HttpClient) { }


  //Display all loans
  public listAllLoans(){
    alert("Loan Display")
    console.log(this.http.get<any[]>(this.baseUrl+'/loans')); 
    
    return this.http.get<any[]>(this.baseUrl+'/loans');
  
    }

     // Search all users by Id
     public getPlicyById(id:string)

     {
   
       console.log(this.http.get<any>(this.baseUrl+'/loanid/'+id));
   
       return this.http.get<any>(this.baseUrl+'/loanid/'+id);
   
     }

     // Add new loans
     public createLoan(loan: Loan)
   {
     //console.log(this.http.post(this.baseUrl+'/addLoan'/));
     return this.http.post(this.baseUrl+'/addLoan/',loan)
    
   }
   
}
