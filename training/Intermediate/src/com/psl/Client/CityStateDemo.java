package com.psl.Client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CityStateDemo {

	public static void main(String[] args) {
		FileReader fi;
		try {
			fi = new FileReader("city.txt");
			BufferedReader br = new BufferedReader(fi);
			String line;
			CityStateMap csm = new CityStateMap();
			while((line = br.readLine())!= null){
				String str[] = line.split("-");
				String state = str[1];
				String city = str[0];				
				csm.addCityState(state, city);
				
			}
			
			System.out.println(csm);
			System.out.println(csm.getAllCity());
			System.out.println(csm.getAllState());
			System.out.println(csm.getCities("madhaya pradesh"));
			csm.deleteCities("rajasthan");
			System.out.println(csm);
			System.out.println(csm.getState("goa"));
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
