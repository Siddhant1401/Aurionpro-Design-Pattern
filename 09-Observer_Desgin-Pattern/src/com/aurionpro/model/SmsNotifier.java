package com.aurionpro.model;

public class SmsNotifier implements INotifier {

	@Override
	public void notifyUser(Account account, double amount, TransactionType type) {
		System.out.println("SMS Notifications : ");
		System.out.println("Transaction : "+type.toString().toLowerCase());
		System.out.println("Amount : "+amount);
		System.out.println("Balance : "+account.getBalance());
		System.out.println("------------------------------------------------------");
	}

	

}
