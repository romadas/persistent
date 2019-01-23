package com.psl.main;

public class Table {
	public static void main(String args[]){
		int n = 0;
		for(int i = 1;i<= 12;i++){
			for(int j= 1; j <= 10 ;j++){
				n = i * j;
			System.out.print(n+ "\t");
			}
			System.out.println("\t");
		}
	}
}
