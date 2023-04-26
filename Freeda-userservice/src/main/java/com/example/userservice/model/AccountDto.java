package com.example.userservice.model;

import java.sql.Date;

public class AccountDto {
	String account_number;
	String customer_master;
	String branch_id;
	int Opening_balance;
	Date account_Opening_date;
	String account_type;
	String account_status;
	public AccountDto() {
    }
	public AccountDto(String account_number, String customer_master, String branch_id, int opening_balance,
			Date account_Opening_date, String account_type, String account_status) {
		super();
		this.account_number = account_number;
		this.customer_master = customer_master;
		this.branch_id = branch_id;
		Opening_balance = opening_balance;
		this.account_Opening_date = account_Opening_date;
		this.account_type = account_type;
		this.account_status = account_status;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getCustomer_master() {
		return customer_master;
	}
	public void setCustomer_master(String customer_master) {
		this.customer_master = customer_master;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public int getOpening_balance() {
		return Opening_balance;
	}
	public void setOpening_balance(int opening_balance) {
		Opening_balance = opening_balance;
	}
	public Date getAccount_Opening_date() {
		return account_Opening_date;
	}
	public void setAccount_Opening_date(Date account_Opening_date) {
		this.account_Opening_date = account_Opening_date;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getAccount_status() {
		return account_status;
	}
	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
}

