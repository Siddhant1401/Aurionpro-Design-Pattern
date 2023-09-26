package com.aurionpro.test;

import com.aurionpro.model.Internet;
import com.aurionpro.model.InvalidAccessException;
import com.aurionpro.model.ProxyInternet;

public class InternetTest {

	public static void main(String[] args) throws InvalidAccessException {
		Internet internet = new ProxyInternet();
		
		internet.connectTo("www.google.com");
		internet.connectTo("Blocked Sites 1");
	}
}
