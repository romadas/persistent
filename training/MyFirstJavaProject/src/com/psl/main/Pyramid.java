package com.psl.main;
public class Pyramid {
	public static void main(String args[]){
		int n = 4;
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i; j+=2){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
