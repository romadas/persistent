package com.psl.Model;
import com.psl.Model.Shape3D;
public class Cube extends Shape3D{
	private double side;

	public Cube(double side) {
		super("cube");
		this.side = side;
	}
	
	
	public double getSide() {
		return side;
	}


	public void setSide(double side) {
		this.side = side;
	}


	@Override
	public void calculateVolume() {
		setVolume(Math.pow(getSide(), 3));
		
	}

	@Override
	public void calculateSurface_area() {
		setSurface_area(4*getSide());
		
	}
	
	
	
}
