package com.raven.example_04.implementation;

import com.raven.example_04.factory.IResponse;

public class OrderResponse implements IResponse {
	String code;
	String startDate;
	String endDate;

	public OrderResponse(String code, String startDate, String endDate) {
		this.code = code;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@Override
	public String getResponse() {
		return "Order details with parameters :: {'" + this.code + "', '" + this.startDate + "', '" + this.endDate + "'}";
	}

}
