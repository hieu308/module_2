package bai_tap_customer.repository;

import bai_tap_customer.model.Customer;

public class CustomerRepository implements ICustomerRepository {
    private static Customer[] list;
    static {
        list = new Customer[5];
      Customer  customer = new Customer(123,"David",23);
        list[0] = customer;
    }

    @Override
    public Customer[] findInfo() {

        return list;
    }


}
