import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss']
})
export class CustomerListComponent implements OnInit {

 //declare variable
 searchTerm='';
 page:number=1;
 pageSize=5;

 constructor(public customerService:customerService,private router:Router) { }

 ngOnInit(): void {
   
   this.customerService.getAllCnustomers();
   
   this.customerService.getAllLoanTYpe();

 }

 //updating asset
 updateCustomer(customer:Customer){
   console.log(customer);
   this.populateAssetData(customer);
   this.router.navigate(['customer/edit',customer.id])
 }

  //getting asset data
  populateAssetData(customer:Customer){
   this.customerService.formAssetData=Object.assign({},customer)//converting employee(only string) to object as formdata is object
 }

 //disable asset
 disableCustomer(id:number){
   if(confirm('Are you sure you want to DELETE this record?')){
     this.customerService.disableCustomer(id)
      .subscribe(
        (response)=>{
          console.log(response)
          this.customerService.getAllCustomers();
        },
        (error)=>{
          console.log(error)    
        }
      )
   }
 }

}
