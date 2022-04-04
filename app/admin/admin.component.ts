import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  loginForm:any;
  submitted: boolean = false;
  invalidLogin: boolean = false;
  admId:number = 0;
  admPsw: string ="";
  

  constructor(private formBuilder: FormBuilder, private router: Router ) { }

  onSubmit(){
    
    this.submitted = true;
    if(this.loginForm.invalid){
      return;
    }
    if(this.loginForm.controls.admId.value ==1001 &&
        this.loginForm.controls.admPsw.value=="123456"){
          localStorage.setItem("admId",this.loginForm.controls.admId.value);
          alert("Successfully logged in as Admin")
          this.router.navigate(['adminPage']);
    }
    else{
      this.invalidLogin = true;
    }
  }

  ngOnInit() {    

    this.loginForm = this.formBuilder.group({
      admId: ['', Validators.required],
      admPsw: ['', Validators.required]
    });

  }
  


 

}
