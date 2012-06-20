package com.github.mpp.thesis.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents a candidate for the thesis
 * @author MAKRANCZI Tam�s
 * @author makranczitamas@gmail.com
 *
 */
public class Candidate extends Student {
	private static final int NO_OF_COORDINATORS = 2;
	
	private int id;	
	private List<Coordinator> coordinators;
	private Thesis thesis;
	
	/**
	 * Constructor
	 * @param name
	 * @param coordinators
	 * @param subjectArea
	 */
	public Candidate(String name, List<Coordinator> coordinators, String subjectArea) {
		super(name, subjectArea);
		this.coordinators = new ArrayList<Coordinator>(coordinators);
		this.thesis = null;
	}
	
	/**
	 * @return the list of coordinators
	 */
	public List<Coordinator> getCoordinators() {
		return coordinators;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the thesis
	 */
	public Thesis getThesis() {
		return thesis;
	}

	/**
	 * @param thesis the thesis to set
	 */
	public void setThesis(Thesis thesis) {
		this.thesis = thesis;
	}
	
}
