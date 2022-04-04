import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm:any;
  submitted: boolean = false;
  invalidLogin: boolean = false;
  userId:number = 0;
  userPsw: string ="";
  

  constructor(private formBuilder: FormBuilder, private router: Router ) { }

  onSubmit(){
    
    this.submitted = true;
    if(this.loginForm.invalid){
      return;
    }
    if(this.loginForm.controls.userId.value ==101||102||103||104||105||107||108||109||110||1048 &&
        this.loginForm.controls.userPsw.value=="123456"||"123456789"){
          localStorage.setItem("userId",this.loginForm.controls.userId.value);
          alert("Successfully logged in as User ")
          this.router.navigate(['userPage']);
    }
    else{
      this.invalidLogin = true;
    }
  }

  ngOnInit() {    

    this.loginForm = this.formBuilder.group({
      userId: ['', Validators.required],
      userPsw: ['', Validators.required]
    });

  }
}
