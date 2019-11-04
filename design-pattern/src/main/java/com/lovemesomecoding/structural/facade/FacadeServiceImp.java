package com.lovemesomecoding.structural.facade;

import com.lovemesomecoding.structural.facade.model.Account;
import com.lovemesomecoding.structural.facade.model.Payment;
import com.lovemesomecoding.structural.facade.model.PaymentMethod;

public class FacadeServiceImp implements FacadeService {

	private AccountService accountService;
	private PaymentMethodService paymentMethodService;
	private PaymentService paymentService;

	// there can more services here.
	private SubscriptionService subscriptionService;
	private EmailService emailService;

	public FacadeServiceImp() {
		super();
		accountService = new AccountService();
		paymentMethodService = new PaymentMethodService();
		paymentService = new PaymentService();

	}

	@Override
	public Account createAccount(String username, String email, String password) {
		// TODO Auto-generated method stub
		return accountService.create(username, email, password);
	}

	@Override
	public Account addPaymentMethod(Account account, PaymentMethod paymentMethod) {
		// TODO Auto-generated method stub
		return paymentMethodService.add(account, paymentMethod);
	}

	@Override
	public Payment makePayment(PaymentMethod paymentMethod, double amount) {
		// TODO Auto-generated method stub
		return paymentService.charge(paymentMethod, amount);
	}

}
