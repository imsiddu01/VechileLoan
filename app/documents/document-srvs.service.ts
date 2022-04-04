import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Documents } from './Documents';

@Injectable({
  providedIn: 'root'
})
export class DocumentSrvsService {
  
  private baseUrl="http://localhost:8090/document";

  constructor(private http:HttpClient) { }

// Add new users
public createDocument(doc: Documents)
{
  alert("to add documents click ok")
  //console.log(this.http.post<any[]>(this.baseUrl+'/addDocument'));
  return this.http.post<any[]>(this.baseUrl+'/addDocument/',doc)
 
}

//Display all documents
public listAllDocuments(){
  alert("document Display")
  console.log(this.http.get<any[]>(this.baseUrl+'/documents')); 
  
  return this.http.get<any[]>(this.baseUrl+'/documents');

  }

   // Search all Documents by Id
   public getDocumentById(id:string)

   {
     alert("Search Documents")
     console.log(this.http.get<any>(this.baseUrl+'/docid/'+id));
 
     return this.http.get<any>(this.baseUrl+'/docid/'+id);
 
   }

}
