package com.model;

public class Tablet extends Medicine {
	@Override
	public void displayLabel(String name, String address) {
		this.Name = name;
		this.Address = address;
		System.out.println(name +" "+address+" store in cool and dry place");
	}	
}
