package com.psl.Client;
import java.io.Serializable;
public class Car implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5797903012697777703L;
	private String make, model, color;
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

	public void setEngine(Engine engine2) {
		// TODO Auto-generated method stub
		this.engine = engine;
		
	}

	public Object getEngine() {
		// TODO Auto-generated method stub
		return engine;
	}

}
