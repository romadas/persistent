package com.psl.util;

import java.util.Random;

public class CommanResource {//called by commanresource on thread
	private int numbers[];
	private boolean available;
	private Random random;
	
	public CommanResource(){
		super();
		numbers = new int[50];
		available = true;
		random = new Random();
	}
	
	public synchronized void getLock() throws InterruptedException{
		while(available == false) wait();
		available = false;
	}
	
	public synchronized void releaseLock(){
		available = true;
		notifyAll();
	}
	
	public int getSize(){
		return numbers.length;
	}
	
	public int generateNumber(){
		int num;
		do {
			num=random.nextInt();
		}while(num < 0 || num > 0x3e8);//1000
			return num;
		
	}
	
	public int getNumber(int index){
		return numbers[index];
	}
	public void setNumber(int index, int value){
		numbers[index] = value;
	}
	
	
}
