package com.examples.adminservice.service;

import org.springframework.stereotype.Service;

import com.examples.adminservice.models.Account;


public interface AccountService {
	
	public Account openAccount(Account acc);
	public String deleteAccount(String accid);
	public Account allAccount();
	
	

}
