package com.psl.client;

import java.lang.reflect.Field;//object's metadata
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("roma","63737",7282.89);
		
		//Class<?> cls = account.getClass();//Generic class
		Class<?> cls = BankAccount.class;
		
		
		for(Field f:cls.getDeclaredFields()){
			System.out.println(f.getType());
			System.out.println(f.getName());
		}
		
		
		System.out.println("--------------");
		for(Method m : cls.getDeclaredMethods()){
			System.out.println(m.getName());
			System.out.println("***********");
			if(m.getName().contains("get")){
				try {
					System.out.println(m.invoke(account));
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
