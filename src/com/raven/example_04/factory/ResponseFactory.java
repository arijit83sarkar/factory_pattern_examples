package com.raven.example_04.factory;

public abstract class ResponseFactory {
	public abstract IResponse createResponse();

	public String generateResponse() {
		IResponse response = createResponse();
		String result = "Creator :: " + response.getResponse();
		return result;
	}
}
