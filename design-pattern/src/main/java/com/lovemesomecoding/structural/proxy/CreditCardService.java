package com.lovemesomecoding.structural.proxy;

public class CreditCardService {

	public boolean authorizeCharge(CreditCard creditCard, double amount) {
		return creditCard.getBankAccount().withdraw(amount);
	}

	public double getAvailableBalance(CreditCard creditCard) {
		// TODO Auto-generated method stub
		return creditCard.getBankAccount().getBalance();
	}
}
