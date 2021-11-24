package com.technoelevate.Java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert {
	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dburl = "jdbc:mysql://localhost:3306/company?user=root&password=root1234";

			connection = DriverManager.getConnection(dburl);

			String query = "insert into emp values(?,?,?,?,?,?,?)";

			preparedStatement = connection.prepareStatement(query);

			Scanner sc = new Scanner(System.in);
			System.out.println("entre the id");
			int id = sc.nextInt();
			System.out.println("entre the name");
			String name = sc.next();
			System.out.println("entre the salary");
			double sal = sc.nextDouble();
			System.out.println("entre the com");
			int com = sc.nextInt();
			System.out.println("entre the job");
			String job = sc.next();
			System.out.println("entre the age");
			int age = sc.nextInt();
			System.out.println("entre the deptno");
			int deptno = sc.nextInt();

			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, sal);
			preparedStatement.setInt(4, com);
			preparedStatement.setString(5, job);
			preparedStatement.setInt(6, age);
			preparedStatement.setInt(7, deptno);

			int res = preparedStatement.executeUpdate();
			if (res != 0) {
				System.out.println(res + "rows affected");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
