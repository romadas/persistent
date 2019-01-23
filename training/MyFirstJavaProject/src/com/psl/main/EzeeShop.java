package com.psl.main;
import java.util.Scanner;
public class EzeeShop {
	private String productName[];
	private String keyword;
	public static String[] initProductNames(String productName[]){
		System.out.println("products are:");
		String str[] = new String[productName.length];
		for(int i = 0; i < productName.length;i++){
			str[i]=productName[i];
			System.out.println(str[i]);
		}
		return str;
	}
	public boolean isPresent(String productName[], String keyword){
		
		//char c[]= productName[0].toCharArray();
		
		boolean result = false;
		//char c = keyword.toCharArray();
		//for(int i = 0; i < productName.length;i++){
			if(productName.toString().contains(keyword)){
				result = true;
			}
			else{
				result = false;
			}
		//}
		return result;
	}
	
	
	
	
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		EzeeShop ez = new EzeeShop();
		String productName[] ={"soap","washing powder"};
		EzeeShop.initProductNames(productName);
		System.out.println("enter the keyword: ");
		String keyword = obj.next();
		System.out.println(ez.isPresent(productName,keyword));
		
	}
}
