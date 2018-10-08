package com.yesjehmi.demo.controller;

import com.yesjehmi.demo.controller.mapper.CustomerRequestMapper;
import com.yesjehmi.demo.controller.request.CustomerRequest;
import com.yesjehmi.demo.domain.Customer;
import com.yesjehmi.demo.service.DemoTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoTestService demoTestService;

    private final CustomerRequestMapper customerRequestMapper;

    @PostMapping("customerRegist")
    public Customer testDemo(@RequestBody CustomerRequest customerRequest) {
        return demoTestService.registCustomer(customerRequestMapper.customerRequestToEntity(customerRequest));
    }
}
