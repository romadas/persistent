package com.persistent.com;

public class Greeter {
	public String name;

	public Greeter(String name) {
		this.name = name;
		System.out.println("");
	}
	
	public void sayHello(){
		System.out.println("hello, "+name);
	}
	public void sayGoodBye(){
		System.out.println("goodbye, "+name);
	}
	
}
