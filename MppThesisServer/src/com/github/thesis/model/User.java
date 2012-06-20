package com.github.thesis.model;

/**
 * @author PRECUP Cristina
 * @author cpcristinaprecup@gmail.com
 *
 */

public class User {
	private int id;
	private final String fullName;
	private final String username;
	private final String password;
	
	/**
	 * Constructor
	 * @param fullName
	 * @param username
	 * @param password
	 */
	public User(String fullName, String username, String password) {
		this.fullName = fullName;
		this.username = username;
		this.password = password;
	}
	
	/**
	 * @return full name of the member
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return username of the member
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return password of the member
	 */
	public String getPassword() {
		return password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
