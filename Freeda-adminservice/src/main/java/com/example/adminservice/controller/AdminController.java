package com.example.adminservice.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examples.adminservice.models.Account;
import com.examples.adminservice.models.Branch;
import com.examples.adminservice.models.Loan;
import com.examples.adminservice.service.AccountService;
import com.examples.adminservice.service.BranchService;
import com.examples.adminservice.service.LoanService;

@RestController
public class AdminController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	BranchService branchService;
	
	@Autowired
	LoanService loanService;
	
	
//	Account mappings
	
	@GetMapping("/")
	public String home() {
		return "Hello sid";
	}
	
	@PostMapping("/createAcc")
	public Account saveAccount(@RequestBody Account acc) {
		accountService.openAccount(acc);
		return acc;
	}
	
	@DeleteMapping("/deleteAccount/{accountNo}")
	public String deleteAccount(@PathVariable(name="accountNo") String accountNo) {
		accountService.deleteAccount(accountNo);
		return "Account deleted";
	}
	
//	Branch mapping
	
	@PostMapping("/createBranch")
	public Branch createBranch(@RequestBody Branch branchMaster) {
		branchService.createBranch(branchMaster);
		return branchMaster;
	}
	
	@DeleteMapping("/deleteBranch/{branchId}")
	public String deleteBranch(@PathVariable(name="branchId") String branchId) {
		branchService.deleteBranch(branchId);
		return "Branch deleted.";
	}
	
	@GetMapping("/allBranches")
	public List<Branch> getAllBranches(){
		return branchService.listAllBranch();
	}
	
//  Loan list
	@GetMapping("/allLoans")
	public List<Loan> loanList(){
		return loanService.listLoans();
	}

}