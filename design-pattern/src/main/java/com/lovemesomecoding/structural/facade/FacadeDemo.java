package com.lovemesomecoding.structural.facade;

import com.lovemesomecoding.structural.facade.model.Account;
import com.lovemesomecoding.structural.facade.model.Payment;
import com.lovemesomecoding.structural.facade.model.PaymentMethod;

public class FacadeDemo {

	public static void main(String[] args) {

		FacadeService facadeService = new FacadeServiceImp();

		String username = "folauk";
		String email = "folaudev@gmail.com";		
		String password = "Test1234!";
		
		Account account = facadeService.createAccount(username, email, password);
		
		PaymentMethod paymentMethod = new PaymentMethod();
		paymentMethod.setAccount(account);
		paymentMethod.setName("Laulau");
		paymentMethod.setLast4("4242");
		
		account = facadeService.addPaymentMethod(account, paymentMethod);
		
		double chargeAmount = 100;
		
		Payment payment = facadeService.makePayment(paymentMethod, chargeAmount);
	}
}
