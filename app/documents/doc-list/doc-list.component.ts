import { Component, OnInit } from '@angular/core';
import { DocumentSrvsService } from '../document-srvs.service';
import { Documents } from '../Documents';

@Component({
  selector: 'app-doc-list',
  templateUrl: './doc-list.component.html',
  styleUrls: ['./doc-list.component.css']
})
export class DocListComponent implements OnInit {

  constructor(private docService:DocumentSrvsService) { }
  listOfDocuments:Documents[]=[];

  ngOnInit(): void {
    this.loadData();
  }
  loadData()
  {
    this.docService. listAllDocuments().subscribe(
      (      data: Documents[])=>
      {
        this.listOfDocuments=data;
        console.log("in doc-list  " +this.listOfDocuments )
      }    
    )
  }

}
