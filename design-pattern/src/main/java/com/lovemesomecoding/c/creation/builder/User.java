package com.lovemesomecoding.c.creation.builder;

// immutable class
public class User {
	
	private String firstName;
	private String lastName;
	private int age;
	private String phone;

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
	}

	//---- all getters no setters
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public static class UserBuilder {
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		
		private UserBuilder() {}

		public static UserBuilder standard() {
			return new UserBuilder();
		}
		
		public static User defaultClient() {
			// set default state here
			return new UserBuilder().build();
		}
		
		public UserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public UserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public User build() {
			User user = new User(this);
			validateUserObject(user);
			return user;
		}

		// validate user object
		private void validateUserObject(User user) {
			
		}
	}
}