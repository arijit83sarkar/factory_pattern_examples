package com.raven.example_04.factory;

import com.raven.example_04.implementation.OrderResponse;

public class OrderResponseCreator extends ResponseFactory {
	String code;
	String startDate;
	String endDate;

	public OrderResponseCreator(String code, String startDate, String endDate) {
		this.code = code;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@Override
	public IResponse createResponse() {
		return new OrderResponse(code, startDate, endDate);
	}

}
