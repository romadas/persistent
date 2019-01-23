package com.psl.Client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserInterface {

	public static void main(String[] args) {
		Car car = new Car();
		car.setMake("audi");
		car.setModel("a-tron");
		car.setColor("bright yellow");
		car.setEngine(new Engine(125,1000,FuelType.DIESEL));
		
		try (ObjectOutputStream oo= new ObjectOutputStream(new FileOutputStream(new File("car.ser")))){
			
			oo.writeObject(car);
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		try(ObjectInputStream oi =new ObjectInputStream(new FileInputStream(new File("car.ser")))){
			Car c = (Car)oi.readObject();
			System.out.println(c.getColor());
			System.out.println( c.getEngine().getFuelType());
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
