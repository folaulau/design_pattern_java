package com.lovemesomecoding.structural.facade;

import com.lovemesomecoding.structural.facade.model.Payment;
import com.lovemesomecoding.structural.facade.model.PaymentMethod;

public class PaymentService {

	public Payment charge(PaymentMethod paymentMethod, double amount) {
		Payment payment = new Payment();
		payment.setPaymentMethod(paymentMethod);
		payment.setDescription("Groceries payment");
		payment.setAmount(amount);
		
		// charge paymentMethod for the amount
		
		return payment;
	}

	
}
