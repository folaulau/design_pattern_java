package com.lovemesomecoding.structural.proxy;

public class CreditCard {
	
	// credit card number
	private String number;
	private String cvc;
	private String expMonth;
	private String expYear;
	private String zipcode;
	private String last4;

	BankAccount bankAccount;

	public CreditCard() {
		this(null);
	}

	public CreditCard(BankAccount bankAccount) {
		this(null,null,null,null,null,null,bankAccount);
	}



	public CreditCard(String number, String cvc, String expMonth, String expYear, String zipcode, String last4,
			BankAccount bankAccount) {
		super();
		this.number = number;
		this.cvc = cvc;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.zipcode = zipcode;
		this.last4 = last4;
		this.bankAccount = bankAccount;
	}



	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	public String getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

	public String getExpYear() {
		return expYear;
	}

	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getLast4() {
		return last4;
	}

	public void setLast4(String last4) {
		this.last4 = last4;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
}
