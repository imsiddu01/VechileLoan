import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Loan } from '../Loan';
import { LoanSrvsService } from '../loan-srvs.service';

@Component({
  selector: 'app-search-loan',
  templateUrl: './search-loan.component.html',
  styleUrls: ['./search-loan.component.css']
})
export class SearchLoanComponent implements OnInit {

  loanObj: Loan = new Loan();
  loanId: string ="";
  notFound: boolean = false;
  no: number=0;

  constructor(private loanSrvs:LoanSrvsService, private router:Router ) { }

  ngOnInit(): void {
  }

  onSearch(){
    console.log("inside search" + this.loanId);
    this.loanSrvs.getPlicyById(this.loanId).
    subscribe((data: Loan) => {
      this.loanObj = data;

      if (this.loanObj) {
        this.notFound = true;
      }
      {
        this.notFound = false;
      }
    },
    (error: any) => {
      alert("Policy not found");
      console.log('Policy not found');
      this.notFound = true;
    })
  }


}
