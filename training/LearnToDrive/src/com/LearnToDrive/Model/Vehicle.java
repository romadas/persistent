package com.LearnToDrive.Model;

import com.LearnToDrive.util.FuelType;

public class Vehicle {
	private String registrationNumber;
	private double price;
	private String name;
	private FuelType fuelType;
	
	public Vehicle()
	{
		
	}
	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", price="
				+ price + ", name=" + name + ", fuelType=" + fuelType + "]";
	}
	public Vehicle(String registrationNumber, double price, String name,
			FuelType fuelType) {
		super();
		this.registrationNumber = registrationNumber;
		this.price = price;
		this.name = name;
		this.fuelType = fuelType;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	
}
