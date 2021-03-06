package com.LearnToDrive.Client;

import com.LearnToDrive.Model.Vehicle;
import com.LearnToDrive.util.FuelType;

public class Test {
	public static Vehicle[] readCSV(String[] data){
		Vehicle[] v = new Vehicle[data.length];
		for(int i = 0; i < data.length; i++){
			String str1[] = data[i].split(",");
			v[i]=new Vehicle();
			v[i].setRegistrationNumber(str1[0]);
			v[i].setPrice(Double.parseDouble(str1[1]));
			v[i].setName(str1[2]);
		
			v[i].setFuelType(FuelType.valueOf(str1[3].toUpperCase()));
			
		}
		
		
		return v;
	}
	public static void main(String args[]){
		 String data[] = {"MH-31-3656,124578,Dominar,Natural_gas","MH-49-6768,36568,activa,petrol","Mh-20-5676,376895,BMW-GS,diesel"};
		Vehicle v[]=Test.readCSV(data);
		 for(int i=0;i<v.length;i++)
		System.out.println(v[i]);
		
	}
}
