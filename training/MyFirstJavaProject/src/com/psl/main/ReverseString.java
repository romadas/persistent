package com.psl.main;
import java.util.Arrays;
public class ReverseString {
	public static void main(String args[]){
		String str[] = {"to","be","roma"} ;
		String str1[] = new String[str.length];
		for(int i = 0; i <= str.length-1; i++){
			str1[i] = "";
			for(int j = str[i].length()-1; j>=0;j--){
				
				str1[i] += str[i].substring(j,j+1);
			}
		}
		for(int i=0;i<str.length;i++)
	    {
	         System.out.println(str1[i]);
	    }
	  
	}
}
