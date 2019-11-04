package com.lovemesomecoding.structural.facade.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private long id;
	private double balance;
	private List<PaymentMethod> paymentMethods;
	private List<Payment> payments;
	private String name;
	private String email;
	private String password;

	public Account() {
		this(0);
	}

	public Account(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<PaymentMethod> getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean charge(double amount) {
		if (balance > 0 && balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public List<PaymentMethod> addPaymentMethod(PaymentMethod paymentMethod) {
		if (this.paymentMethods == null) {
			this.paymentMethods = new ArrayList<>();
		}
		this.paymentMethods.add(paymentMethod);
		return this.paymentMethods;
	}

	public List<Payment> addPayment(Payment payment) {
		if (this.payments == null) {
			this.payments = new ArrayList<>();
		}
		this.payments.add(payment);
		return this.payments;
	}
}
