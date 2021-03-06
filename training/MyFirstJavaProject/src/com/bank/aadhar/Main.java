package com.bank.aadhar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	for( Map.Entry<Aadhar,List<BankAccount>> data : readFromFile("xyz.txt").entrySet()){
		System.out.println(data.getKey().getNumber());
		System.out.println(data.getValue());
	}

	}
	public static Map<Aadhar,List<BankAccount>> readFromFile(String fileName){
		Map<Aadhar,List<BankAccount>> m = new HashMap<Aadhar,List<BankAccount>>();
		try{
			File f = new File("xyz.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine())!=null){
				Aadhar a = new Aadhar(s);
				m.put(a, new ArrayList<BankAccount>());
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return m;
	}
}
