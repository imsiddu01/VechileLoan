import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../User';
import { UserSrvsService } from '../user-srvs.service';

@Component({
  selector: 'app-user-by-id',
  templateUrl: './user-by-id.component.html',
  styleUrls: ['./user-by-id.component.css']
})
export class UserByIdComponent implements OnInit {

  userObj: User = new User();
  userId: number =0;
  notFound: boolean = false;
  no: number=0;

  constructor(private UserService:UserSrvsService, private router:Router ) { }

  ngOnInit(): void {
  }

  onSearch(){
    console.log("inside search" + this.userId);
    this.UserService.getUserById(this.userId).
    subscribe((data: User) => {
      this.userObj = data;

      if (this.userObj) {
        this.notFound = true;
      }
      {
        this.notFound = false;
      }
    },
    (error: any) => {
      alert("User not found");
      console.log('user not found');
     
      this.notFound = true;
    })
  }

}
