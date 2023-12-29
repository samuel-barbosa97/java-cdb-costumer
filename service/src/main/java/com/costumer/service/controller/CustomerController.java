package com.costumer.service.controller;

import com.costumer.service.dto.CustomerDTO;
import com.costumer.service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/costumers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerDTO> createCostumer(@RequestBody CustomerDTO customerDTO) {
        CustomerDTO createdCostumer = customerService.createCustomer(customerDTO);
        return new ResponseEntity<>(createdCostumer, HttpStatus.CREATED);
    }
}
