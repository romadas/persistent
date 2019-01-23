package com.LearnToDrive.Model;

public class SUV extends Car{
	private boolean fourWheelDrive;
	public SUV(){
		fourWheelDrive = false;
	}
	public SUV (String make,
				String model, 
				String color, 
				boolean fourWheelDrive){
		super(make,model,color);
		this.fourWheelDrive = fourWheelDrive;
	}
	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}
	@Override
	public String toString() {
		return super.toString()+" "+ isFourWheelDrive();
		
	}
	

}
