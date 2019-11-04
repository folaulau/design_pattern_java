package com.lovemesomecoding.structural.facade;

import com.lovemesomecoding.structural.facade.model.Account;
import com.lovemesomecoding.structural.facade.model.Payment;
import com.lovemesomecoding.structural.facade.model.PaymentMethod;

public interface FacadeService {

	Account createAccount(String username, String email, String password);
	
	
	Account addPaymentMethod(Account account, PaymentMethod paymentMethod);
	
	
	Payment makePayment(PaymentMethod paymentMethod, double amount);
}
