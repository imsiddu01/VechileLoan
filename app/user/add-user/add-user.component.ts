import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../User';
import { UserSrvsService } from '../user-srvs.service';


@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  addForm!: any;
  submitted : boolean = false;
//   nosList:number[] = [];
//   userId: number=0;
//   userName: string="";
//  userDob: string="";
//  userMob: number=0;
//   userPsw : string ="";

  constructor(private formBuilder:FormBuilder,private router:Router,
   private userService:UserSrvsService ) { }

  ngOnInit() {
   
    this.addForm=this.formBuilder.group({
      userId:[],
      userName:['', Validators.required],
      userDob: ['', Validators.required],
     // userMob: ['', Validators.required],
      userPsw:[] // ['', Validators.required]

    });    
  }
  
  onSubmit(){
    this.submitted=true;
    if(this.addForm.invalid){
      return;
    }
    
    this.userService.createUser(this.addForm.value)
      .subscribe( data => {
        this.router.navigate(['/addVehi']);
      });
  }

}
