package com.psl.Client;

public class Client {
	public static void main(String args[]){
		Thread t = Thread.currentThread();
		
		System.out.println(t);
		for(int x = 1; x<= 5;x++){
			System.out.println(x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		t.setName("My main thread");
		System.out.println(t);
	}
}
