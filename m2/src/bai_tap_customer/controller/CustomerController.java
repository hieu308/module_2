package bai_tap_customer.controller;

import bai_tap_customer.model.Customer;
import bai_tap_customer.service.CustomerService;
import bai_tap_customer.service.ICustomerService;

public class CustomerController {
    ICustomerService iCustomerService = new CustomerService();
    public void displayCustomer () {
        Customer[] customer = iCustomerService.findInfo();
       for (Customer custom : customer) {
           if (custom != null) {
               System.out.println(custom);
           }
       }
    }
}
