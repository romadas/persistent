package com.psl.Client;
import java.io.Serializable;


public class Engine implements Serializable{
	
	
	private static final long serialVersionUID = 8677631227056871188L;
	private double horsePower;
	private int cubicCapacity;
	private FuelType fueltype;
	private Engine engine;
	public Engine(double horsePower, int cubicCapacity, FuelType fueltype) {
		super();
		this.horsePower = horsePower;
		this.cubicCapacity = cubicCapacity;
		this.fueltype = fueltype;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public double getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	public int getCubicCapacity() {
		return cubicCapacity;
	}
	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	public FuelType getFueltype() {
		return fueltype;
	}
	public void setFueltype(FuelType fueltype) {
		this.fueltype = fueltype;
	}
	
}
