package com.raven.example_01.factory;

import com.raven.example_01.implementation.ConcreteProduct2;

public class ConcreteCreator2 extends Creator {

	@Override
	public IProduct factoryMethod() {
		return new ConcreteProduct2();
	}

}
