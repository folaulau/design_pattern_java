package com.lovemesomecoding.structural.proxy;

public class BankAccount {

	private long id;
	private String routingNumber;
	private String accountNumber;
	private String name;
	private double balance;
	private double transferFee;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getTransferFee() {
		return transferFee;
	}
	public void setTransferFee(double transferFee) {
		this.transferFee = transferFee;
	}
	public boolean withdraw(double amount) {
		if(balance>0 && balance>=amount) {
			balance-=amount;
			return true;
		}
		throw new RuntimeException("Nothing enough funds in your account.");
	}
	
	
	
}
