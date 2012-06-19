package com.github.thesis.persistence;

import java.util.List;

import com.github.thesis.model.Candidate;
import com.github.thesis.model.Catalog;
import com.github.thesis.model.CommitteeMember;
import com.github.thesis.model.CommitteeSecretary;
import com.github.thesis.model.Secretary;

/**
 * @author Orban Szilard
 *
 */
public interface IRepositoryManager {
	/**
	 * @return The list of commitee Secretaries.
	 */
	public List<CommitteeSecretary> getAllSecretaries();	
	
	/**
	 * @return The list of candidates.
	 */
	public List<Candidate> getAllCandidates();
	
	
	/**
	 * @return The list of catalogs.
	 */
	public List<Catalog> getAllCatalogs();
	
	/**
	 * @return The list of Committee Members.
	 */
	public List<CommitteeMember> getAllCommitteeMembers();
}
