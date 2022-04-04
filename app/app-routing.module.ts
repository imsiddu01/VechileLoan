import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserListComponent } from './user/user-list/user-list.component';
import { UserByIdComponent } from './user/user-by-id/user-by-id.component';
import { AddUserComponent } from './user/add-user/add-user.component';

import { LoginComponent } from './login/login.component';
import { AdminSrvsService } from './admin-srvs.service';
import { AdminComponent } from './admin/admin.component';
import { UserPageComponent } from './user/user-page/user-page.component';
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


const routes: Routes = [
  { path: '',component:AdminloginComponent },
  {path:'users',component:UserListComponent},
  {path:'userById',component:UserByIdComponent},
  {path:'addUsers',component:AddUserComponent},
  {path: 'login',component:LoginComponent},
  {path: 'admins',component:AdminComponent},
  {path:'userPage',component:UserPageComponent},
  {path: 'adminPage',component:AdminPageComponent},
  {path: 'vehiList',component:VehiListComponent},
  {path: 'vehiById', component:SearchVehiComponent},
  {path: 'loanList',component:LoanListComponent},
  {path: 'loanById',component:SearchLoanComponent},
  {path: 'addVehi',component:AddVehiComponent},
  {path: 'addLoan',component:AddLoanComponent},
  {path: 'addDoc',component:AddDocComponent},
  {path: 'docList',component:DocListComponent},
  {path: 'docById',component:SearchDocComponent}

  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
