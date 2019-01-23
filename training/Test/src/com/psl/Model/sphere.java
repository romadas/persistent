package com.psl.Model;

public class sphere extends Shape3D{
	private double raduis;
	
	
	
	public sphere(double raduis) {
		super("sphere");
		this.raduis = raduis;
	}

	public double getRaduis() {
		return raduis;
	}

	public void setRaduis(int raduis) {
		this.raduis = raduis;
	}

	@Override
	public void calculateVolume() {
		setVolume(4/3*Math.PI*Math.pow(getRaduis(), 3));
		
	}

	@Override
	public void calculateSurface_area() {
		setSurface_area(4*Math.PI*Math.pow(getRaduis(), 2));
		
	}
	
	
	
	
	
	
}
