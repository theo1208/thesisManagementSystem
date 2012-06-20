package com.github.mpp.thesis.model;

/**
 * @author PRECUP Cristina
 * @author cpcristinaprecup@gmail.com
 *
 */

public class Coordinator {
	private int id;	
	private final String name;
	
	/**
	 * Constructor
	 * @param name
	 */
	public Coordinator(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
}
