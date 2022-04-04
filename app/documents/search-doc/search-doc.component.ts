import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DocumentSrvsService } from '../document-srvs.service';
import { Documents } from '../Documents';

@Component({
  selector: 'app-search-doc',
  templateUrl: './search-doc.component.html',
  styleUrls: ['./search-doc.component.css']
})
export class SearchDocComponent implements OnInit {

  docObj: Documents = new Documents();
  docId: string="";
  notFound: boolean = false;
  no: number=0;

  constructor(private docSrvs:DocumentSrvsService, private router:Router ) { }

  ngOnInit(): void {
  }

  onSearch(){
    console.log("inside search" + this.docId);
    this.docSrvs.getDocumentById(this.docId).
    subscribe((data: Documents) => {
      this.docObj = data;

      if (this.docObj) {
        this.notFound = true;
      }
      {
        this.notFound = false;
      }
    },
    (error: any) => {
      alert("Document not found");
      console.log('Document not found');
      this.notFound = true;
    })
  }

}
