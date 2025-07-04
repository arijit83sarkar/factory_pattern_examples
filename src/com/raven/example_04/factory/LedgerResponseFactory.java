package com.raven.example_04.factory;

import com.raven.example_04.implementation.LedgerResponse;

public class LedgerResponseFactory extends ResponseFactory {
	String code;
	String startDate;
	String endDate;

	public LedgerResponseFactory(String code, String startDate, String endDate) {
		super();
		this.code = code;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@Override
	public IResponse createResponse() {
		return new LedgerResponse(code, startDate, endDate);
	}

}
