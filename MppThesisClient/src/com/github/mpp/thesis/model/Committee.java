package com.github.mpp.thesis.model;

import java.util.List;

/**
 * Class that represents a committee in a Thesis Session
 * @author MAKRANCZI Tam�s
 * @author makranczitamas@gmail.com
 *
 */
public class Committee {
	private final String name;
	private Catalog catalog;
	private int id;
	private CommitteeSecretary secretary;	
	private List<CommitteeMember> members;
	
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	
	public List<CommitteeMember> getMembers() {
		return members;
	}

	public void setMembers(List<CommitteeMember> members) {
		this.members = members;
	}	
	
	public CommitteeSecretary getSecretary() {
		return secretary;
	}

	public void setSecretary(CommitteeSecretary secretary) {
		this.secretary = secretary;
	}
}
