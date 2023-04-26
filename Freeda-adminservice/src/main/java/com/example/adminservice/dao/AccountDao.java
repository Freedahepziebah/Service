package com.example.adminservice.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.examples.adminservice.models.Account;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AccountDao extends JpaRepository<Account,String> {
	
	

}
