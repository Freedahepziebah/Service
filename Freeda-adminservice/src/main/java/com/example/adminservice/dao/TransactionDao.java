package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.adminservice.models.Transaction;

@Repository
public interface TransactionDao extends JpaRepository<Transaction, String> {

}
