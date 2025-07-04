package com.raven.example_03.factory;

public abstract class ChartFactory {
	public abstract IChart createChart();

	public String generateChart() {
		IChart chart = createChart();
		String result = "Creator: The same creator's code has just worked with " + chart.draw();
		return result;
	}
}
