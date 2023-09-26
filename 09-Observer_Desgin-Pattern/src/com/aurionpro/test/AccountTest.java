package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.SmsNotifier;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account(01, "Ram", 3000);
		account.registerNotifier(new SmsNotifier());
		account.registerNotifier(new EmailNotifier());
		
		account.withdraw(1000);
		account.deposit(3000);
	}
}
