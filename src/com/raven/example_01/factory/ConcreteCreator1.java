package com.raven.example_01.factory;

import com.raven.example_01.implementation.ConcreteProduct1;

//Concrete Creators override the factory method in order to change the
// resulting product's type.
public class ConcreteCreator1 extends Creator {

	// Note that the signature of the method still uses the abstract product
	// type, even though the concrete product is actually returned from the
	// method. This way the Creator can stay independent of concrete product
	// classes.

	@Override
	public IProduct factoryMethod() {
		return new ConcreteProduct1();
	}

}
