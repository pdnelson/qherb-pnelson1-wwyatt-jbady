package edu.ycp.cs320.entrelink.controller;

import edu.ycp.cs320.entrelink.model.Numbers;

public class AddNumbersController {
	
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model = model;
	}
	
	public Double add() {
		return model.getFirst() + model.getSecond() + model.getThird();
	}
	
}
