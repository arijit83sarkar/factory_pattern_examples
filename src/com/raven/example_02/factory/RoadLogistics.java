package com.raven.example_02.factory;

import com.raven.example_02.implementation.Truck;

public class RoadLogistics extends Logistic {

	@Override
	public ITransport planDelivery() {
		return new Truck();
	}

}
