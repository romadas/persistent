package com.psl.main;
public class ControlFlow {
	public static boolean isLeap(int year){
		boolean result = false;
		if(year % 100 == 0 && year % 400 == 0 ){
			result = true;
		}else if(year % 4 == 0){
			result = true;
		}
		return result;
	}
	public static boolean isOdd(int year){
		if(year%2 != 0){
			return true;
		}else {
			return false;
		}
	}
	public static int isFact(int year){
		int fact = 1;
		for(int i =1;i <= year ; i++){
			fact = fact * i;
		}
		return fact;
	}
	public static boolean isPrime(int year){
		boolean result = false;
		for(int i = 2;i <= year/2 ;++i){
			if(year%i==0){
				result = false;
			}
			else{
				result = true;
			}
		}
		return result;
	}
		
	
	public static void main(String args[]){
		int year = 3;
		System.out.println("year is leap year :"+ ControlFlow.isLeap(year));
		System.out.println("number is odd:"+ ControlFlow.isOdd(year));
		System.out.println("factorial of number:" +ControlFlow.isFact(year));
		System.out.println("number is prime:" +ControlFlow.isPrime(year));
	}
}