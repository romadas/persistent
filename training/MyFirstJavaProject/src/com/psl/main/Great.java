package com.psl.main;
public class Great {
	public static void main(String args[]){
		int a,b,c, temp, result;
		a = 4;
		b = 5;
		c = 1;
		temp = a > b ? a:b;
		result = temp > c ? temp:c;
		System.out.println(result);
	}
}
