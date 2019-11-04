package com.lovemesomecoding.structural.proxy;

/**
 * Proxy is a structural design pattern that lets you provide a substitute <br>
 * or placeholder for another object. A proxy controls access to the <br>
 * original object, allowing you to perform something either before <br>
 * or after the request gets through to the original object.<br>
 * 
 * Why would you want to control access to an object? Here is an example:<br>
 * you have a massive object that consumes a vast amount of system <br>
 * resources. You need it from time to time, but not always.<br>
 * 
 * @author folaukaveinga
 *
 */
public class ProxyDemo {
	
	static CreditCardService creditCardService = new CreditCardService();

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setId(1);
		bankAccount.setAccountNumber("000123456789");
		bankAccount.setRoutingNumber("110000000");
		bankAccount.setBalance(1000);
		bankAccount.setName("Laulau");
		
		CreditCard masterCard = new CreditCard(bankAccount);
		
		// charge $100;
		double chargeAmount = 100;
		
		double availableBalance = creditCardService.getAvailableBalance(masterCard);
		
		System.out.println("availableBalance: $"+availableBalance);
		
		boolean ok = creditCardService.authorizeCharge(masterCard, chargeAmount);
		
		System.out.println("charge ok? "+ok);
	}
}
