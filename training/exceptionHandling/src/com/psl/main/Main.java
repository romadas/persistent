package com.psl.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String args[]){
		/*try(FileReader fr = new FileReader("some-files")){
			
		}catch (IOException ex){
			
		}*/
		System.out.println(calculateSpeed(55,0));
		
	}
	public static void searchProduct(String productCode) throws ProductNotFoundException{
		throw new ProductNotFoundException("not found");
	}
	private static double calculateSpeed(double distance, double time){
		assert distance > 0 : "distance can't be zero";
		assert time > 0 :"time can't be zero";
		return distance/time;
	}
}
