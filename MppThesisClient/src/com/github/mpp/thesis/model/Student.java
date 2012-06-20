package com.github.mpp.thesis.model;

/**
 * @author POPESCU Carmen Teodora
 * @autor PRECUP Cristina, cpcristinaprecup@gmail.com
 *
 */

public class Student {
	private int id;
	private final String name;
	private final String subjectArea;
	private String year;
	
	/**
	 * Constructor
	 * @param name
	 * @param subjectArea
	 * @param year
	 */
	public Student(String name, String subjectArea, String year) {
		this.name = name;
		this.subjectArea = subjectArea;
		this.year = year;
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param subjectArea
	 */
	public Student(String name, String subjectArea) {
		this.name = name;
		this.subjectArea = subjectArea;
		this.year = "undefined";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the subjectArea
	 */
	public String getSubjectArea() {
		return subjectArea;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}