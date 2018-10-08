package com.yesjehmi.demo.service;

import com.yesjehmi.demo.domain.Customer;
import com.yesjehmi.demo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoTestService {
    private final CustomerRepository customerRepository;

    public Customer registCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
