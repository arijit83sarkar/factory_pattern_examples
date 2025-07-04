package com.raven.example_01.implementation;

import com.raven.example_01.factory.IProduct;

//Concrete Products provide various implementations of the Product
// interface.
public class ConcreteProduct1 implements IProduct {

	@Override
	public String Operation() {
		return "{Result of ConcreteProduct1}";
	}

}
