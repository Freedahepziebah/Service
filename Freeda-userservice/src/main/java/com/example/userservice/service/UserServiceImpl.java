package com.example.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userservice.dao.UserDao;
import com.example.userservice.model.Customer;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDao userDao;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return userDao.save(customer);
	}

	@Override
	public Customer registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
