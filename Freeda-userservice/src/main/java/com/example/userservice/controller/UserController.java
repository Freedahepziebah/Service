package com.example.userservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.model.Customer;
import com.example.userservice.service.UserService;

@RestController
@RequestMapping(name="User")
public class UserController{
	@Autowired
	UserService service;
	@GetMapping
	public Customer registerCustomer(@RequestBody Customer customer) {
		return service.registerCustomer(customer);
	}
}
	
