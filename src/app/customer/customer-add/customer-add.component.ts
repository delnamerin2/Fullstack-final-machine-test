import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.scss']
})
export class CustomerAddComponent implements OnInit {

  constructor(public customerService: customerService,
    private router: Router) { }

  ngOnInit(): void {
    console.log(this.customerService.getAllCustomers());
  }

  //insert
  addCustomer(form: NgForm) {
    console.log("inserting....");
    this.customerService.insertCustomer(form.value)
      .subscribe(
        (Response) => {
          console.log(Response);
        },
        (error) => {
          console.log(error);
        }
      )

    // this.resetForm(form);
  }

  //submit the form
  onSubmit(form: NgForm) {

    console.log(form.value);
    //Insert
    this.addCustomer(form); 
    form.resetForm();

    this.router.navigateByUrl('/customers/list');
    
  }


}