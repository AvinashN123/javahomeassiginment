
package com.technoelevate.Java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicDelete {

	public static void main(String[] args) {
       Connection connection=null;
       PreparedStatement statement=null;
       ResultSet resultSet=null;
		

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306/company?user=root&password=root1234";
			connection = DriverManager.getConnection(dburl);

			String query = "delete emp where id=?";
			statement = connection.prepareStatement(query);

			Scanner sc = new Scanner(System.in);
			System.out.println("entre the id");
			int id = sc.nextInt();
		   statement.setInt(1, id);

			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				System.out.println("id :" + resultSet.getInt(1));
				System.out.println("Name :" + resultSet.getString(2));
				System.out.println("job:" + resultSet.getString(5));
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (statement != null) {
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
