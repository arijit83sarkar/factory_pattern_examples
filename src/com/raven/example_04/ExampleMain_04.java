package com.raven.example_04;

import com.raven.example_04.factory.LedgerResponseFactory;
import com.raven.example_04.factory.OrderResponseCreator;
import com.raven.example_04.factory.ResponseFactory;

public class ExampleMain_04 {

	public static void main(String[] args) {
		ResponseFactory factory = new OrderResponseCreator("1000083", "2023-03-02", "2023-05-20");
		System.out.println(factory.generateResponse());

		factory = new LedgerResponseFactory("1000083", "2023-03-02", "2023-05-20");
		System.out.println(factory.generateResponse());
	}

}
