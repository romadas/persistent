package com.psl.Model;

public abstract class Shape3D {
	private String name;
	private double volume, surface_area;
	
	public Shape3D(String name) {
		super();
		this.name = name;
		
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
	public abstract void calculateSurface_area();
	
}
