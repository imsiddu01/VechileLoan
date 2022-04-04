import { Component, OnInit } from '@angular/core';
import { Loan } from '../Loan';
import { LoanSrvsService } from '../loan-srvs.service';

@Component({
  selector: 'app-loan-list',
  templateUrl: './loan-list.component.html',
  styleUrls: ['./loan-list.component.css']
})
export class LoanListComponent implements OnInit {

  constructor(private loanSer:LoanSrvsService) { }
  listOfLoan:Loan[]=[];

  ngOnInit(): void {
    this.loadData();
  }
  loadData()
  {
    this.loanSer. listAllLoans().subscribe(
      (      data: Loan[])=>
      {
        this.listOfLoan=data;
        console.log("in vehi-list  " +this.listOfLoan )
      }    
    )
  }

}
