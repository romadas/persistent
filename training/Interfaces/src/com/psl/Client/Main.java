package com.psl.Client;

public class Main {
	public static void main(String args[]) {
		driveVehicle(new Airplan());
		driveVehicle(new Truck());
		String.
	}
	public static void driveVehicle(Driveable d){
		d.accelerate();
		d.steer();
	}
}
