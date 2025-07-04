package com.raven.example_02.implementation;

import com.raven.example_02.factory.ITransport;

public class Truck implements ITransport {

	@Override
	public String deliver() {
		return "{Delivery by Truck}";
	}

}
