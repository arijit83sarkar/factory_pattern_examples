package com.raven.example_02.factory;

public abstract class Logistic {
	public abstract ITransport planDelivery();

	public String createTransport() {
		ITransport transport = planDelivery();
		String result = "Creator: The same creator's code has just worked with " + transport.deliver();
		return result;
	}
}
