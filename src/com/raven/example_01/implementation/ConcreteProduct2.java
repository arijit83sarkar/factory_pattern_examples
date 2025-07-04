package com.raven.example_01.implementation;

import com.raven.example_01.factory.IProduct;

public class ConcreteProduct2 implements IProduct {

	@Override
	public String Operation() {
		return "{Result of ConcreteProduct2}";
	}

}
