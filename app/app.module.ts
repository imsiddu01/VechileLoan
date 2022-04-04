import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserListComponent } from './user/user-list/user-list.component';
import { UserByIdComponent } from './user/user-by-id/user-by-id.component';
import { AddUserComponent } from './user/add-user/add-user.component';
import { AdminComponent } from './admin/admin.component';

import { UserPageComponent } from './user/user-page/user-page.component';
import { LoginComponent } from './login/login.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { VehiListComponent } from './vehicle/vehi-list/vehi-list.component';
import { SearchVehiComponent } from './vehicle/search-vehi/search-vehi.component';
import { LoanListComponent } from './loan/loan-list/loan-list.component';
import { SearchLoanComponent } from './loan/search-loan/search-loan.component';
import { AddVehiComponent } from './vehilce/add-vehi/add-vehi.component';
import { AddLoanComponent } from './loan/add-loan/add-loan.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AddDocComponent } from './documents/add-doc/add-doc.component';
import { DocListComponent } from './documents/doc-list/doc-list.component';
import { SearchDocComponent } from './documents/search-doc/search-doc.component';


@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserByIdComponent,
    AddUserComponent,
    AdminComponent,
    UserPageComponent,
    LoginComponent,
    AdminPageComponent,
    VehiListComponent,
    SearchVehiComponent,
    LoanListComponent,
    SearchLoanComponent,
    AddVehiComponent,
    AddLoanComponent,
    AdminloginComponent,
    AddDocComponent,
    DocListComponent,
    SearchDocComponent,

   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
