package com.LearnToDrive.Model;

public class Car extends Object {
	protected String make, model, color;
	private Engine engine;
	public Car(){
		make = model = color = "";
	}

	public String getMake() {
		return make;
	}
	/* member method
	 * *instance method
	 * getter = accessors
	 * setter = mutator
	 */
	public void setMake(String make) {
		this.make = make;
	}
	public Car(String make, String model,String color){
		this.color = color;
		this.make = make;
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString(){
		return getMake()+" "+getModel()+" "+getColor();
	}

}
