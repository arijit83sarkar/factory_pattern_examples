package com.raven.example_02;

import com.raven.example_02.factory.Logistic;
import com.raven.example_02.factory.RoadLogistics;
import com.raven.example_02.factory.WaterLogistics;

public class ExampleMain_02 {

	public static void main(String[] args) {
		System.out.println("----------- Example #02 --------------");
		System.out.println("");
		new Client().Main();
	}

}

class Client {
	public void Main() {
		System.out.println("App: Launched with the RoadLogistics.");
		ClientCode(new RoadLogistics());

		System.out.println("----------------------------------------------------------------");

		System.out.println("App: Launched with the WaterLogistics.");
		ClientCode(new WaterLogistics());
	}

	// The client code works with an instance of a concrete creator, albeit
	// through its base interface. As long as the client keeps working with
	// the creator via the base interface, you can pass it any creator's
	// subclass.
	public void ClientCode(Logistic creator) {
		// ...
		System.out.println(
				"Client: I'm not aware of the creator's class," + "but it still works.\n" + creator.createTransport());
		// ...
	}
}
