package com.example.userservice.model;

import java.sql.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.common.base.Optional;

import java.util.List;

public interface Proxy {
	@GetMapping("/applyloan")
	public LoanDto applyLoan(@RequestBody LoanDto loan);
	
	@PostMapping("/doTransactions")
	public LoanDto doTransactions(@RequestBody TransactionDto transaction);
	
	@GetMapping("/searchbynumanddate/{account_number}/{date_of_transaction}")
	public Optional<TransactionDto>searchByAccountNumberandDate(@PathVariable("account_number") String account_master,@PathVariable("date_of_transaction") Date date_of_transaction);	
	
	@GetMapping("/showalltransactions")
	public List<TransactionDto>showAllTransactions();
	
	@GetMapping("/searchbyaccountnumber/{account_number}")
	public List<TransactionDto> searchByAccount(@PathVariable("account_number") String account_number);

}
