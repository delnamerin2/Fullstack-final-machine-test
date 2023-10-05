import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CustomerAddComponent } from './customer-add/customer-add.component';
import { CustomerViewComponent } from './customer-view/customer-view.component';
import { CustomerHomeComponent } from './customer-home/customer-home.component';

const routes: Routes = [
  
  { path: 'home', component: CustomerHomeComponent},
  { path: 'add', component: CustomerAddComponent},
  { path: 'list', component: CustomerViewComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomerRoutingModule { }
