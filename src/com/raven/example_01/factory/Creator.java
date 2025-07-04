package com.raven.example_01.factory;

public abstract class Creator {

	// Note that the Creator may also provide some default implementation of
	// the factory method.
	public abstract IProduct factoryMethod();

	public String SomeOperation() {
		// Call the factory method to create a Product object.
		var product = factoryMethod();
		// Now, use the product.
		var result = "Creator: The same creator's code has just worked with " + product.Operation();

		return result;
	}
}
