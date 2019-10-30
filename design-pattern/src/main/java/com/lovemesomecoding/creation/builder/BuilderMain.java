package com.lovemesomecoding.creation.builder;

import com.lovemesomecoding.creation.builder.User.UserBuilder;
import com.lovemesomecoding.utils.ObjectUtils;
import com.lovemesomecoding.utils.RandomGeneratorUtils;

public class BuilderMain {

	public static void main(String[] args) {
	
		User user = UserBuilder.standard()
				.age(12)
				.phone("3101234567")
				.firstName("Folau")
				.lastName("Kaveinga")
				.age(25)
				.build();
		
		System.out.println(ObjectUtils.toJson(user));
		
		StringBuilder sqlBuilder = new StringBuilder("");
		String query = sqlBuilder
		.append("SELECT * FROM user ")
		.append("WHERE id = 1")
		.toString();
		
		System.out.println("query: "+query);
	}

}
