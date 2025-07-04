package com.raven.example_03.implementation;

import com.raven.example_03.factory.IChart;

public class PieChart implements IChart {
	private double radious;

	public PieChart(double radious) {
		this.radious = radious;
	}

	@Override
	public String draw() {
		return "{I am a Pie chart with a radious of " + radious + "}";
	}

}
