import { Injectable } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Loantype } from '../model/loantype';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  formAssetData: customer = new Customer();
  customer: Customer[];
  loanType: Loantype[];
  constructor(private httpClient: HttpClient) { }
  getAllCustomers(): void {
    //getting the data
    this.httpClient.get(environment.apiURL + '/api/customers')
      .toPromise()
      .then(response => {
        console.log(response);
        this.customer= response as Customer[];
      },
        error => {
          console.log('Error')
        })
  }

  getAllLoanType(): void {
    this.httpClient.get(environment.apiURL + '/api/getloantype')
      .toPromise()
      .then(response => {
        console.log(response)
        this.loanType = response as Loantype[]
      },
        error => {
          console.log(error)
        });

  }

 
  //adding 
  insertCustomer(customer: Customer): Observable<any> {
    console.log(customer);
    return this.httpClient.post(environment.apiURL + '/api/add', customer);
  }
  //disable
  disableCustomer(id: number) {
    return this.httpClient.get(environment.apiURL + '/api/customers/deactivate/' + id)
  }
  // //update
   updateCustomer(customer: Customer):Observable<any>{
   return this.httpClient.put(environment.apiURL+'/api/customer/edit',customer)
   }

}
