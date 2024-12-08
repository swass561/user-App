package com.user.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String country;
    private String password;

    // Constructor with all fields
    public User(int id, String name, String email, String country, String password) {
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setCountry(country);
        this.setPassword(password);
    }
    
    // Other constructors if needed
    public User() {
        // Default constructor
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    // Getters and Setters
    // (Include getters for all fields like getId, getName, getEmail, getCountry, getPassword)
}
