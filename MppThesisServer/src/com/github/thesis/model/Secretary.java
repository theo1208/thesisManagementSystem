package com.github.thesis.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PRECUP Cristina
 * @author cpcristinaprecup@gmail.com
 *
 */

public class Secretary extends User {
	
	private List<String> subjectAreas;
	
	/**
	 * Constructor
	 * @param fullName
	 * @param username
	 * @param password
	 * @param subjectAreas
	 */
	public Secretary(String fullName, String username, String password, List<String> subjectAreas) {
		super(fullName, username, password);
		subjectAreas = new ArrayList<String>(subjectAreas);
	}

	/**
	 * @return the subjectAreas
	 */
	public List<String> getSubjectAreas() {
		return subjectAreas;
	}
	
}