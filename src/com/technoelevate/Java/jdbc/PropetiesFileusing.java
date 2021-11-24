package com.technoelevate.Java.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class PropetiesFileusing {
	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			FileReader fileReader = new FileReader(
					"F:\\eclipse-workspace\\src\\com\\technoelevate\\Java\\jdbc\\resourses");
			Properties properties = new Properties();
			properties.load(fileReader);

			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(properties.getProperty("url"), properties);
			System.out.println("  connection established ");

			// String query = "select * from emp where id=?";
			// preparedStatement = connection.prepareStatement(query);

			// preparedStatement.setInt(1, Integer.parseInt(properties.getProperty("id")));

			// resultSet = preparedStatement.executeQuery();

			String query = "update emp set com=? where id=?";
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, Integer.parseInt(args[0]));
			preparedStatement.setInt(2, Integer.parseInt(args[1]));

			int res = preparedStatement.executeUpdate();

			if (res != 0) {
				System.out.println(res + "row affected");
			}

			while (resultSet.next()) {
				System.out.println("  connection established ");
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
			}

		} catch (IOException | ClassNotFoundException | SQLException e) {
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

			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
