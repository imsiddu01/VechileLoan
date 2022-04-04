import { Component, OnInit } from '@angular/core';
import { User } from '../User';
import { UserSrvsService } from '../user-srvs.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  constructor(private useSer:UserSrvsService) { }
  userList:User[]=[];

  ngOnInit(): void {
    this.loadData();
  }
  loadData()
  {
    this.useSer.listAllUsers().subscribe(
      (      data: User[])=>
      {
        this.userList=data;
        console.log("in user-list  " +this.userList )
      }    
    )
  }

}
