package com.client;

import java.util.Random;

import com.model.Medicine;
import com.model.Ointment;
import com.model.Syrup;
import com.model.Tablet;


public class TestMedicine {
	public static void main(String args[]){
		TestMedicine tm = new TestMedicine();
		Medicine m = new Medicine();
		m.displayLabel("abc","cdf");
		int[] medicine = new int[10];
		int max = 3;
		int min = 1;
		int range = max-min+1;
		int rand = 0;
		for(int i = 0; i < 10;i++){
			rand = (int)(Math.random()*range)+min;
			//System.out.println(rand);
		}
		switch(rand){
			case 1: Ointment o = new Ointment();
					o.displayLabel("ointment","xyz");
					break;
			case 2 : Syrup s = new Syrup();
					s.displayLabel("syrup","ghf");
					break;
			case 3 : Tablet t = new Tablet();
					t.displayLabel("tablet","sdf");
					break;
			default : System.out.println("not present");
		}
		
	}
		
}
