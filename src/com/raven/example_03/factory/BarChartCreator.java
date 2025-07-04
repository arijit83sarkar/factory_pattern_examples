package com.raven.example_03.factory;

import com.raven.example_03.implementation.BarChart;

public class BarChartCreator extends ChartFactory {
	private String type;

	public BarChartCreator(String type) {
		this.type = type;
	}

	@Override
	public IChart createChart() {
		return new BarChart(this.type);
	}

}
