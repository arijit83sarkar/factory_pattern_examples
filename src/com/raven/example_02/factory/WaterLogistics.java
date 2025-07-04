package com.raven.example_02.factory;

import com.raven.example_02.implementation.Ship;

public class WaterLogistics extends Logistic {

	@Override
	public ITransport planDelivery() {
		return new Ship();
	}
}
