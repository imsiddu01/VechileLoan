import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { DocumentSrvsService } from '../document-srvs.service';

@Component({
  selector: 'app-add-doc',
  templateUrl: './add-doc.component.html',
  styleUrls: ['./add-doc.component.css']
})
export class AddDocComponent implements OnInit {
   
  addForm!: any;
  submitted : boolean = false;

  constructor(private formBuilder:FormBuilder,private router:Router,
   private docService:DocumentSrvsService) { }

  ngOnInit(): void {

    this.addForm=this.formBuilder.group({

      docId:[],
     adharcardNumber:['', Validators.required],
      panCard:['', Validators.required]

    });    
  }

  onSubmit(){
    this.submitted=true;
    if(this.addForm.invalid){
      return;
    }
    alert("Successfully added the documents")
    this.docService.createDocument(this.addForm.value)
      .subscribe( data => {
        alert("Successfully added the documents")
        this.router.navigate(['/docList']);
      });
  }

}
