package com.raven.example_02.implementation;

import com.raven.example_02.factory.ITransport;

public class Ship implements ITransport {

	@Override
	public String deliver() {
		return "{Delivered by Ship}";
	}

}
