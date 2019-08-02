package com.lovemesomecoding.a.creation.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * This approach has serialization and thread-safety guaranteed.
 */
public enum EnumSingleton {

	INSTANCE;

	private Connection connection = null;

	private EnumSingleton() {
		System.out.println("Get new connection to mysql!");
		
		try {
			String host = "localhost";
			String port = "3306";
			String dbName = "mysql_playground";

			String username = "root";
			String password = "";

			connection = DriverManager.getConnection(
					"jdbc:mysql://" + host + ":" + port + "/" + dbName
							+ "?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC",
					username, password);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		if(connection==null) {
			System.err.println("connection not established!");
		}
		return connection;
	}

	// add other logic

}
