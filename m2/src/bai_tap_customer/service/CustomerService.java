package bai_tap_customer.service;

import bai_tap_customer.model.Customer;
import bai_tap_customer.repository.CustomerRepository;
import bai_tap_customer.repository.ICustomerRepository;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public Customer[] findInfo() {
        return iCustomerRepository.findInfo();
    }
}
