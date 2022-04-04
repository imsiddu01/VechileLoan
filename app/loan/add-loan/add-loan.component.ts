import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoanSrvsService } from '../loan-srvs.service';

@Component({
  selector: 'app-add-loan',
  templateUrl: './add-loan.component.html',
  styleUrls: ['./add-loan.component.css']
})
export class AddLoanComponent implements OnInit {

  addForm!: any;
  submitted : boolean = false;
//   nosList:number[] = [];
//   userId: number=0;
//   userName: string="";
//  userDob: string="";
//  userMob: number=0;
//   userPsw : string ="";

  constructor(private formBuilder:FormBuilder,private router:Router,
   private loanService:LoanSrvsService ) { }

  ngOnInit() {
   
    this.addForm=this.formBuilder.group({

      loanId:[],
      admId:['', Validators.required],
      loanAmt:['', Validators.required],
      emi:['', Validators.required],
      startDate:[],//['', Validators.required],
      endDate:['', Validators.required]
  
      // vehNo:[],
      // vehName:[], // ['', Validators.required],
      // vehType: [],//['', Validators.required],
     // userMob: ['', Validators.required],
      //userPsw:[] // ['', Validators.required]

    });    
  }
  
  onSubmit(){
    this.submitted=true;
    if(this.addForm.invalid){
      return;
    }
    this.loanService.createLoan(this.addForm.value)
      .subscribe( data => {
        this.router.navigate(['/loanList']);
      });
  }


}
