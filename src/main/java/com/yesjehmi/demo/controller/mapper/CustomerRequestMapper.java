package com.yesjehmi.demo.controller.mapper;

import com.yesjehmi.demo.controller.request.CustomerRequest;
import com.yesjehmi.demo.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerRequestMapper {

    public Customer customerRequestToEntity(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setFirstName(customerRequest.getFirstName());
        customer.setLastName(customerRequest.getLastName());

        return customer;
    }
}
