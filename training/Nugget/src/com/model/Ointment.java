package com.model;

public class Ointment extends Medicine{

	@Override
	public void displayLabel(String name, String address) {
		this.Name = name;
		this.Address = address;
		System.out.println(this.Name +" "+this.Address+" for external use only");
		
	}
	
	
	

}
