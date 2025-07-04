package com.raven.example_01;

import com.raven.example_01.factory.ConcreteCreator1;
import com.raven.example_01.factory.ConcreteCreator2;
import com.raven.example_01.factory.Creator;

public class ExampleMain_01 {

	public static void main(String[] args) {
		System.out.println("----------- Example #01 --------------");
		System.out.println("");
		new Client().Main();
	}

}

class Client {
	public void Main() {
		System.out.println("App: Launched with the ConcreteCreator1.");
		ClientCode(new ConcreteCreator1());

		System.out.println("----------------------------------------------------------------");

		System.out.println("App: Launched with the ConcreteCreator2.");
		ClientCode(new ConcreteCreator2());
	}

	// The client code works with an instance of a concrete creator, albeit
	// through its base interface. As long as the client keeps working with
	// the creator via the base interface, you can pass it any creator's
	// subclass.
	public void ClientCode(Creator creator) {
		// ...
		System.out.println(
				"Client: I'm not aware of the creator's class," + "but it still works.\n" + creator.SomeOperation());
		// ...
	}
}
