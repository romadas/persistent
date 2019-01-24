package com.psl.Client;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.psl.util.BankAccount;

public class Client {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			
			BankAccount ironman = new BankAccount("tony stark",568.45,"6752",Date.valueOf("2019-01-01"));
			
			BankAccount batman = new BankAccount("bruce wayne",563.45,"6751",Date.valueOf("2019-02-02"));
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "root");
			connection.setAutoCommit(false);
			Statement statement;
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String sql;
			
			sql = String.format("INSERT INTO tbl_bank_accounts VALUES('%s','%s','%f','%s')",
																	ironman.getNumber(),
																	ironman.getFullName(),
																	ironman.getBalance(),
																	ironman.getOpenededOn());
			
			//statement.executeUpdate(sql);
			sql = String.format("INSERT INTO tbl_bank_accounts VALUES('%s','%s','%f','%s')",
					batman.getNumber(),
					batman.getFullName(),
					batman.getBalance(),
					batman.getOpenededOn());
			//statement.executeUpdate(sql);
			
			ResultSet resultSet;
			resultSet = statement.executeQuery("SELECT * FROM tbl_bank_accounts");
			
			while(resultSet.next()){//for forward iteration
				System.out.println(resultSet.getString("account_number"));
				System.out.println(resultSet.getString("full_name"));
				System.out.println(resultSet.getDouble("balance"));
				System.out.println(resultSet.getDate("opening_date"));
				System.out.println("**************************");
			}
			
			while(resultSet.previous()){//for backwards iteration
				System.out.println(resultSet.getString("account_number"));
				System.out.println(resultSet.getString("full_name"));
				System.out.println(resultSet.getDouble("balance"));
				System.out.println(resultSet.getDate("opening_date"));
				System.out.println("**************************");
				
			}
			
			resultSet.absolute(2);//places pointer on second record
			resultSet.relative(-1);//move the cursor relative to current position
			
			resultSet.updateDouble("balance", 7826);
			resultSet.updateDate("opening_date", Date.valueOf("2003-10-01"));
			resultSet.updateRow();
			
			statement.close();
			
			PreparedStatement prepareStatement;
			
			prepareStatement = connection.prepareStatement("INSERT INTO tbl_bank_accounts VALUES(?,?,?,?)");
			
			prepareStatement.setString(1, "roma");
			prepareStatement.setString(2, "4345");
			prepareStatement.setDouble(3, 111167.92);
			prepareStatement.setDate(4,Date.valueOf("2010-10-08"));
			prepareStatement.executeUpdate();
			connection.commit();
			//not for mpc
			/*MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
			ds.setUrl("");*/
			 
		} catch (SQLException e) {	
			e.printStackTrace();
		}finally{
			if(connection!=null)
				try{
					connection.close();
				}catch (SQLException e) {	
					e.printStackTrace();
				}
		}
		
	}

}
