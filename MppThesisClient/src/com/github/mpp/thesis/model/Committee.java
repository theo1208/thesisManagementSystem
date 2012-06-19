package com.github.mpp.thesis.model;

/**
 * Class that represents a committee in a Thesis Session
 * @author MAKRANCZI Tam�s
 * @author makranczitamas@gmail.com
 *
 */
public class Committee {
	private final String name;
	private Catalog catalog;
	
	/**
	 * Constructor
	 * @param name
	 */
	public Committee(String name) {
		this.name = name;
	}
	
	/**
	 * @return 
	 * @returns name of a committee
	 */
	public String getName() {
		return name;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	
}
