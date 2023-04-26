package com.examples.adminservice.service;

import java.util.List;

import com.examples.adminservice.models.Branch;

public interface BranchService {
	public Branch createBranch(Branch branch);
	public String deleteBranch(String branchId);
	public List<Branch> listAllBranch();
}
