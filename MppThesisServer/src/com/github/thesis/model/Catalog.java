package com.github.thesis.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author POPESCU Carmen Teodora
 *
 */

public class Catalog {
	private List<Candidate> candidates;

	/**
	 * Constructor
	 * @param candidates
	 */
	public Catalog(List<Candidate> candidates) {
		this.candidates = new ArrayList<Candidate>(candidates);
	}

	/**
	 * @return the candidates
	 */
	public List<Candidate> getCandidates() {
		return candidates;
	}
	
}
