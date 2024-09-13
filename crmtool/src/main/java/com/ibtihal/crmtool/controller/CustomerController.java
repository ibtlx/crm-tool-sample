package com.ibtihal.crmtool.controller;

import com.ibtihal.crmtool.model.Customer;
import com.ibtihal.crmtool.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> createCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerService.createCustomer(customer);
        
        // Create a response object with customer data and a message
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Customer created successfully and hosted online!");
        response.put("customer", createdCustomer);
        
        return ResponseEntity.ok(response);
    }
}


