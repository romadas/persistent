package com.practice.sql;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]){
		Connection connection = null;
		record roma = new record("3", "roma", "A");
		record astha = new record("1", "astha", "A");
		record khusboo = new record("2", "khushboo", "A");
		record shivanee = new record("4", "shivanee", "A");
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			Statement statement;
			statement = connection.createStatement();
			
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement("INSERT INTO student VALUES(?,?,?)");
			preparedStatement.setString(1, "1");
			preparedStatement.setString(2, "astha");
			preparedStatement.setString(3, "A");
			
			preparedStatement.setString(1, "2");
			preparedStatement.setString(2, "khushboo");
			preparedStatement.setString(3, "A");
			
			preparedStatement.setString(1, "3");
			preparedStatement.setString(2, "roma");
			preparedStatement.setString(3, "A");
			
			preparedStatement.setString(1, "4");
			preparedStatement.setString(2, "shivanee");
			preparedStatement.setString(3, "A");
			
			preparedStatement.setString(1, "5");
			preparedStatement.setString(2, "abc");
			preparedStatement.setString(3, "A");
			
			preparedStatement.execute();
			
		
		
		
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
