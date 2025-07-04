package com.raven.example_03.factory;

import com.raven.example_03.implementation.PieChart;

public class PieChartCreator extends ChartFactory {
	private double radious;

	public PieChartCreator(double radious) {
		this.radious = radious;
	}

	@Override
	public IChart createChart() {
		return new PieChart(radious);
	}

}
