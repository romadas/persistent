package com.psl.Client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Properties p = new Properties();
		try{
			p.load(new FileReader(new File("configration.properties")));
			System.out.println(p.get("os"));
			System.out.println(p.get("RAM"));
			System.out.println(p.get("Storage"));
			
			Scanner obj = new Scanner(new File("abcc"));
			while(obj.hasNext()){
				String line = obj.next();
				Scanner token = new Scanner(line);
				token.useDelimiter(",");
				while(token.hasNext()){
					String value = token.next();
				}
			}
			
			FileReader fr = new FileReader(new File("xyz"));
			BufferedReader br =new BufferedReader(fr);
			
			File f = new File("C:\\Windows\\some-file");
		
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
