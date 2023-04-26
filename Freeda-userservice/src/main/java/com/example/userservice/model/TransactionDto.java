package com.example.userservice.model;

import java.sql.Date;

public class TransactionDto {
	String transaction_number;
	String account_master;
	Date date_of_transaction;
	String transaction_type;
	int transaction_amount;
	public TransactionDto() {

	}
	public TransactionDto(String transaction_number, String account_master, Date date_of_transaction,
			String transaction_type, int transaction_amount) {
		super();
		this.transaction_number = transaction_number;
		this.account_master = account_master;
		this.date_of_transaction = date_of_transaction;
		this.transaction_type = transaction_type;
		this.transaction_amount = transaction_amount;
	}
	public String getTransaction_number() {
		return transaction_number;
	}
	public void setTransaction_number(String transaction_number) {
		this.transaction_number = transaction_number;
	}
	public String getAccount_master() {
		return account_master;
	}
	public void setAccount_master(String account_master) {
		this.account_master = account_master;
	}
	public Date getDate_of_transaction() {
		return date_of_transaction;
	}
	public void setDate_of_transaction(Date date_of_transaction) {
		this.date_of_transaction = date_of_transaction;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public int getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(int transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
}
