package com.elobank.domain.service;

import com.elobank.domain.entity.Customer;
import com.elobank.domain.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer registerNewCustomer(Customer customer) {
        var result = customerRepository.save(customer);
        return result;
    }

}
