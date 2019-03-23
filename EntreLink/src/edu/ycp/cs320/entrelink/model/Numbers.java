package edu.ycp.cs320.entrelink.model;

public class Numbers {
	
	private Double first, second, third;
	private Double result;
	
	public Numbers() {
	}
	
	//set numbers
	public void setFirst(Double first) {
		this.first = first;
	}
	public void setSecond(Double second) {
		this.second = second;
	}
	public void setThird(Double third) {
		this.third = third;
	}
	public void setResult(Double result) {
		this.result = result;
	}
	
	//get numbers
	public Double getFirst() {
		return first;
	}
	public Double getSecond() {
		return second;
	}
	public Double getThird() {
		return third;
	}
	public Double getResult() {
		return result;
	}
	
}
