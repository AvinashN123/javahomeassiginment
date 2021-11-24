package com.technoelevate.Java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticUpdate {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;;
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		String dburl="jdbc:mysql://localhost:3306/company";
		connection=DriverManager.getConnection(dburl,"root","root1234");
	
		
		String query="update emp  set com=456 where id=222";
		statement=connection.createStatement();
		
		int res=statement.executeUpdate(query);
		if(res!=0) {
			System.out.println("1 row is effected");
			
			
		}
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	finally {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
		
		if(statement!=null) {
			
	  try {
		statement.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		}
		
	}
	
	
	
}
}
