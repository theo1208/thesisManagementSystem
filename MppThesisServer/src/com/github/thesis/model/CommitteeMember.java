package com.github.thesis.model;

/**
 * Class that represents a member of a committee
 * @author MAKRANCZI Tam�s
 * @author makranczitamas@gmail.com
 *
 */
public class CommitteeMember extends User {
	private final Committee refCommittee;
	/**
	 * Constructor
	 * @param fullName
	 * @param username
	 * @param password
	 * @param committee
	 */
	public CommitteeMember(String fullName, String username, String password, Committee committee) {
		super(fullName, username, password);
		this.refCommittee = committee;
	}
	
	

	/**
	 * @return committee to which this member belongs to
	 */
	public Committee getRefCommittee() {
		return refCommittee;
	}
	
}
