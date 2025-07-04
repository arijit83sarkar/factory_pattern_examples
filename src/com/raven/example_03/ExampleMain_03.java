package com.raven.example_03;

import com.raven.example_03.factory.BarChartCreator;
import com.raven.example_03.factory.ChartFactory;
import com.raven.example_03.factory.PieChartCreator;

public class ExampleMain_03 {

	public static void main(String[] args) {
		System.out.println("----------- Example #03 --------------");
		System.out.println("");
		new Client().Main();
	}

}

class Client {
	public void Main() {
		System.out.println("App: Launched with the BarChartCreator.");
		ClientCode(new BarChartCreator("BarChart"));

		System.out.println("----------------------------------------------------------------");

		System.out.println("App: Launched with the PieChartCreator.");
		ClientCode(new PieChartCreator(4.6));
	}

	// The client code works with an instance of a concrete creator, albeit
	// through its base interface. As long as the client keeps working with
	// the creator via the base interface, you can pass it any creator's
	// subclass.
	public void ClientCode(ChartFactory creator) {
		// ...
		System.out.println(
				"Client: I'm not aware of the creator's class," + "but it still works.\n" + creator.generateChart());
		// ...
	}
}
