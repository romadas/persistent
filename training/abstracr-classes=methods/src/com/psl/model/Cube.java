package com.psl.model;

public class Cube extends Shape1{
	private double side;

	public Cube(double side) {
		super("Cube");
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void calculateVolume(){
		setVolume(getSide()*getSide());
	}
	
}
