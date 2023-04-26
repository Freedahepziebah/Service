package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.adminservice.models.Loan;

@Repository
public interface LoanDao extends JpaRepository<Loan, String> {

}
