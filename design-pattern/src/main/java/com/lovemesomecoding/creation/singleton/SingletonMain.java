package com.lovemesomecoding.creation.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonMain {

	private static Logger log = LoggerFactory.getLogger(SingletonMain.class);
	
	public static void main(String[] args) throws SQLException, InterruptedException {

		Arrays.asList(1, 2, 3, 4, 5 ).parallelStream().forEach((num) -> {
			SingletonMain singletonMain = new SingletonMain();
			try {
				singletonMain.getUsers();
				log.info("Thread Name: {}, num: {}",Thread.currentThread().getName(),num);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		System.out.println("\n\n");
		
		Thread.sleep(1500);

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
			log.info("id: {}, salary: {}", id, salary);
			//System.out.println("id: " + id + ", salary: " + salary);
		}
	}
}
