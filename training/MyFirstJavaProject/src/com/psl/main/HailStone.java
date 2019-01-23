package com.psl.main;
import java.util.Scanner;
public class HailStone {
	public static void main(String args[]){
		//Scanner obj = new Scanner(System.in);
		int i = 7;
		while(i>1){
			if(i % 2 == 0){
				i = i/2;
			}
			else{
				i = (3*i)+1;
			}
			System.out.print(" "+i);
			//break;
		}
		
	}

}
