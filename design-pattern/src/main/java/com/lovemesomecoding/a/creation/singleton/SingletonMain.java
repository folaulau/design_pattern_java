package com.lovemesomecoding.a.creation.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonMain {

	public static void main(String[] args) throws SQLException {
		// best way
		SingletonMain singletonMain = new SingletonMain();

		singletonMain.getUsers();

		// calling this method results in reusing the connection that
		// has been established already. We are using a singleton here.
		singletonMain.getUsers();
	}

	public void getUsers() throws SQLException {
		Connection connection = EnumSingleton.INSTANCE.getConnection();
		
		

		Statement stmt = connection.createStatement();

		ResultSet rs = stmt.executeQuery("select * from user");

		while (rs.next()) {

			int id = rs.getInt("id");
			int salary = rs.getInt("salary");

			System.out.println("id: " + id + ", salary: " + salary);
		}
	}
}
