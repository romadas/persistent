package com.client;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.beans.ConnectioManager;
import com.beans.Peripheral;
import com.beans.PriceComparator;
import com.beans.QuantityComparator;

public class Client {

	public static void main(String[] args) throws SQLException {
		/* write your code here */
		
		Set<Peripheral> p = new HashSet<Peripheral>();
		readPeripheralInventory(p);
		
		System.out.println(p);
		
		insertPeripheralRecords(p);
	
		System.out.println(sortInventoryByPrice(p));
		
		System.out.println(sortInventoryByQuantityPrice(p));
		System.out.println(filterInventoryByPrice(1000, 10000, p));
	}

	/** this method will read peripheral details from the CSV file
	given to you and populate the Set*/
	public static void readPeripheralInventory(Set<Peripheral> peripherals) {
		/* write your code here */
		
		FileReader fr;
		try {
			fr = new FileReader("Peripherals.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null){
				Peripheral p = new Peripheral();
				String[] s = line.split(",");
				String itemCode = s[0];
				String name = s[1];
				String description = s[2];
				int price  =Integer.parseInt(s[3]);
				int quantity = Integer.parseInt(s[4]);
				p.setItemCode(itemCode);
				p.setName(name);
				p.setDescription(description);
				p.setPrice(price);
				p.setQuantity(quantity);
				peripherals.add(p);
		
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	/** this method will insert the peripheral information read earlier
	into a database table 
	 * @throws SQLException */
	public static void insertPeripheralRecords(Set<Peripheral> peripherals) throws SQLException {
		ConnectioManager cm = new ConnectioManager();
		Connection c = cm.getConnection();
		for(Peripheral p : peripherals){
			PreparedStatement ps = c.prepareStatement("insert into peripheral values (?,?,?,?,?)");
			ps.setString(1, p.getItemCode());
			ps.setString(2, p.getName());
			ps.setString(3, p.getDescription());
			ps.setInt(4, p.getPrice());
			ps.setInt(5,p.getQuantity());
			ps.executeUpdate();
		}
		
		
	}

	/** this method will sort a given Set by price in the ascending order.
	It will create a new ordered Set and return it. */
	public static Set<Peripheral>  sortInventoryByPrice(Set<Peripheral> peripherals) {
		/* write your code here */
		Set<Peripheral> p = new TreeSet<Peripheral>(new PriceComparator());
		p.addAll(peripherals);
		
		return p;
	}

	/** this method will sort a given Set by quantity in the ascending order.
	Peripherals with the same quantity should be sorted amongst themselves 
	by price in the ascending order. It will return a new Set with the sorted objects */
	public static Set<Peripheral>  sortInventoryByQuantityPrice(Set<Peripheral> peripherals) {
		TreeSet<Peripheral> p = new TreeSet<Peripheral>(new QuantityComparator());
		p.addAll(peripherals);
		return p;
	}

	/** this method will return a new Set with records filtered from an existing Set on the basis
	of price. Both prices are inclusive. */
	public static Set<Peripheral> filterInventoryByPrice(int startingPrice, int endingPrice, Set<Peripheral> peripherals) {
		Set<Peripheral> p = new HashSet<Peripheral>();
		for(Peripheral p1 : peripherals) {
			if(startingPrice<=p1.getPrice()&&endingPrice>=p1.getPrice()){
				p.add(p1);
			}
		}
		return p;
	}
}
