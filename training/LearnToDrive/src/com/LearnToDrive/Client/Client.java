package com.LearnToDrive.Client;
import com.LearnToDrive.Model.Car;
import static java.lang.Math.sqrt;
import com.LearnToDrive.Model.SUV;
import com.LearnToDrive.Model.Sedan;
import com.LearnToDrive.util.FuelType;
public class Client{
	
	
	public static void main(String args[]){
		Car xuv, baleno;
		xuv = new Car();
		xuv.setMake("abc");
		xuv.setModel("10");
		xuv.setColor("red");
		System.out.println(xuv.getColor());
		System.out.println(xuv.getMake());
		System.out.println(xuv.getModel());
		baleno = new Car("a","b","c");
		System.out.println(baleno.getColor());
		System.out.println(baleno.getMake());
		System.out.println(baleno.getModel());
		SUV rexton = new SUV();
		rexton.setColor("red");
		rexton.setMake("SHUISY");
		rexton.setModel("rexton");
		rexton.setFourWheelDrive(true);
		Sedan ciaz = new Sedan();
		ciaz.setColor("peach");
		ciaz.setMake("hfj");
		ciaz.setModel("ciaz");
		ciaz.setConvertible(true);
		FuelType f;
		f = FuelType.NATURAL_GAS;
		FuelType.DIESEL.getCombustionTemperature();//calling
		switch(f){
		case DIESEL :
		case NATURAL_GAS:
			
		}
		for(FuelType ft : FuelType.values()){
			System.out.println(ft);
			System.out.println(ft.getCombustionTemperature());
		}
	}
}