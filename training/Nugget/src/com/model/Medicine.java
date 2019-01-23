package com.model;
public  class Medicine {
	public String Name, Address;
	
	public void displayLabel(String name, String address){
		this.Name = name;
		this.Address = address;
		System.out.println("name of the company  " + name);
		System.out.println("address of the company "+address);
	}
}