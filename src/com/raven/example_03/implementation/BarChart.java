package com.raven.example_03.implementation;

import com.raven.example_03.factory.IChart;

public class BarChart implements IChart {
	private String type;

	public BarChart(String type) {
		this.type = type;
	}

	@Override
	public String draw() {
		return "{" + this.type + " created!}";
	}

}
