package com.github.mpp.thesis.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author POPESCU Carmen Teodora
 *
 */

public class Catalog {
	private List<Candidate> candidates;
	private int id;
	
	/**
	 * Constructor
	 * @param candidates
	 */
	public Catalog(List<Candidate> candidates) {
		this.candidates = new ArrayList<Candidate>(candidates);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the candidates
	 */
	public List<Candidate> getCandidates() {
		return candidates;
	}
	
}
