package com.psl.model;

public abstract class Shape1 {
	private String name;
	private double volume, surface_area;
	
	public Shape1(String name, double volume, double surface_area) {
		super();
		this.name = name;
		this.volume = volume;
		this.surface_area = surface_area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getSurface_area() {
		return surface_area;
	}

	public void setSurface_area(double surface_area) {
		this.surface_area = surface_area;
	}
	
	public abstract void calculateVolume();
	public abstract void calculatesurface_area();
	
	
	
	
}
