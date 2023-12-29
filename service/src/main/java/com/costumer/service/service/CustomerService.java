package com.costumer.service.service;

import com.costumer.service.dto.CustomerDTO;
import com.costumer.service.model.Customer;
import com.costumer.service.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());

        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer.toDTO();
    }
}
