package com.psl.Model;

public class Circle extends Shape2D {
	private double raduis;
	
	public Circle(double raduis){
		super("Circle");
		this.raduis = raduis;
	}
	public double getRaduis() {
		return raduis;
	}

	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}
	public void calculateArea(){
		setArea(Math.PI*getRaduis()*getRaduis());
	}
	public void calculatePerimeter(){
		setPerimeter(2*Math.PI*getRaduis());
	}
	
	
	
	

}
