package com.examples.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.adminservice.dao.AccountDao;
import com.examples.adminservice.models.Account;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDao accountDao;

	@Override
	public Account openAccount(Account acc) {
	
		return accountDao.save(acc);
	}

	@Override
	public String deleteAccount(String account_number) {
		// TODO Auto-generated method stub
		accountDao.deleteById(account_number);
		return "Object deleted..";
	}

	@Override
	public Account allAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
