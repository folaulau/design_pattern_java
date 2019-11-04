package com.lovemesomecoding.structural.facade;

import com.lovemesomecoding.structural.facade.model.Account;
import com.lovemesomecoding.structural.facade.model.PaymentMethod;

public class PaymentMethodService {

	public Account add(long accountId, PaymentMethod paymentMethod) {
		// get Account from db
		return add(new Account(accountId), paymentMethod);
	}

	public Account add(Account account, PaymentMethod paymentMethod) {
		account.addPaymentMethod(paymentMethod);
		return account;
	}

}
