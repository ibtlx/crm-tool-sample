package com.ibtihal.crmtool.service;

import com.ibtihal.crmtool.model.Customer;
import com.ibtihal.crmtool.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
