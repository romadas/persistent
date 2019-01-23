package com.psl.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.psl.util.Aadhar;
import com.psl.util.BankAccount;
import com.psl.util.BankAccountFullNameComparator;

public class UserInterface {

	public static void main(String[] args) {
		List<String> str;
		str = new ArrayList<String>();
		
		str.add("new");
		str.add("day");
		str.add("evreyday");
		
		System.out.println(str.get(2));
		System.out.println(str.size());
		System.out.println(str.remove(0));
		for(String s : str){
			System.out.println(s);
		}
		Iterator<String> itr = str.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		ListIterator<String> lst_itr = str.listIterator();
		while(lst_itr.hasPrevious()){
			System.out.println(lst_itr.previous());
		}
		if(str.contains("everyday")){
			
		}
		List<BankAccount> accounts;
		
		accounts = new LinkedList<BankAccount>();
		accounts.add(new BankAccount("2525",225.45));
		accounts.add(new BankAccount("2522",325.49));
		accounts.add(new BankAccount("2521",725.46));
		
		for(BankAccount ac:accounts){
			System.out.println(ac);
		}
		
		if(accounts.contains(new BankAccount("2522",0))){
			System.out.println("found");
		}
		System.out.println("************");
		Set<BankAccount> acs;
		acs = new HashSet<BankAccount>();
		acs.add(new BankAccount("5272",7252));
		acs.add(new BankAccount("4537",84767));
		acs.add(new BankAccount("4537",84767));//object not added in hashset
		acs.add(new BankAccount("676256",51245));
		
		System.out.println(acs.size());
		for(BankAccount ac : acs){
			System.out.println(ac);
		}
		
		System.out.println("$$$$$$$");
		SortedSet<BankAccount> sortedBankAccounts;
		sortedBankAccounts = new TreeSet<BankAccount>();
		sortedBankAccounts.add(new BankAccount("3656",3567));
		sortedBankAccounts.add(new BankAccount("523643",6372));
		sortedBankAccounts.add(new BankAccount("5264",6372));
		sortedBankAccounts.add(new BankAccount("6325",264));
		
		for(BankAccount ac : sortedBankAccounts){
			System.out.println(ac);
		}
		
		sortedBankAccounts = new TreeSet<BankAccount>(new BankAccountFullNameComparator());
		sortedBankAccounts.add(new BankAccount("roma","56242",7625622));
		sortedBankAccounts.add(new BankAccount("bhumika","56245",762563));
		sortedBankAccounts.add(new BankAccount("shikha","56241",762563));
		sortedBankAccounts.add(new BankAccount("aparna","56612",76256253));
		for(BankAccount ac : sortedBankAccounts){
			System.out.println(ac.getFullName()+"-----"+ac);
		}
		System.out.println("$$$$$$$");
		
		Set<BankAccount> accountObjects = new LinkedHashSet<BankAccount>();
		
		accountObjects.add(new BankAccount("yyy","2762",62754));
		accountObjects.add(new BankAccount("xxx","2761",62753));
		accountObjects.add(new BankAccount("zzz","2763",62752));
		accountObjects.add(new BankAccount("aaa","2764",62751));
		
		
		for(BankAccount ac :accountObjects ){
			System.out.println(ac.getFullName()+"-----"+ac);
		}
		Map<String,BankAccount> m;
		m = new HashMap<String, BankAccount>();
		
		m.put("627623", new BankAccount());
		m.put("1876128", new BankAccount());
		
		System.out.println(m.get("1876128"));
		
		
		for(Map.Entry<String, BankAccount> ac: m.entrySet()){
			System.out.println(ac.getKey());
			System.out.println(ac.getValue());
		}
		for(Map.Entry<Aadhar,List<BankAccount>> data:readFromFile("abc.txt").entrySet()){
			System.out.println(data.getKey().getNumber());
			System.out.println(data.getValue());
		}
		
	}
	
	public static Map<Aadhar,List<BankAccount>> readFromFile(String fileName){
		
		Map<Aadhar,List<BankAccount>> ret=new HashMap<Aadhar, List<BankAccount>>();
		try{
			File f = new File("abc.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null){
				Aadhar a = new Aadhar(s);
				ret.put(a, new ArrayList<BankAccount>());
	
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		return ret;
	}
	
	public static void fetchAccountDetailsFromDB( Map<Aadhar,List<BankAccount>> data){
		
	}

}
