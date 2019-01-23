package com.model;

public class Syrup extends Medicine {

	@Override
	public void displayLabel(String name, String address) {
		this.Name = name;
		this.Address = address;
		System.out.println(name +" "+address+" for cough and cold");
	}
	
	

}
