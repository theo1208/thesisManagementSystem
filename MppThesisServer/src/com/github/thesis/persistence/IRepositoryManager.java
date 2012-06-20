package com.github.thesis.persistence;

import java.util.List;

import com.github.thesis.model.Candidate;
import com.github.thesis.model.Catalog;
import com.github.thesis.model.Committee;
import com.github.thesis.model.CommitteeMember;
import com.github.thesis.model.CommitteeSecretary;
import com.github.thesis.model.Coordinator;
import com.github.thesis.model.CouncilMember;
import com.github.thesis.model.Secretary;
import com.github.thesis.model.Student;
import com.github.thesis.model.Thesis;

/**
 * @author Orban Szilard
 *
 */
public interface IRepositoryManager {
	/**
	 * @return The list of candidates.
	 */
	public List<Candidate> getAllCandidates();	
	
	/**
	 * @return The list of catalogs.
	 */
	public List<Catalog> getAllCatalogs();
	
	/**
	 * @return The list of committee members.
	 */
	public List<CommitteeMember> getAllCommitteeMembers();	
	
	/**
	 * @return The list of committee secretaries.
	 */
	public List<CommitteeSecretary> getAllCommitteeSecretaries();	
		
	/**
	 * @return The list of all coordinators.
	 */
	public List<Coordinator> getAllCoordinators();
		
	/**
	 * @return The list of council members.
	 */
	public List<CouncilMember> getAllCouncilMembers();
		
	/**
	 * @return The list of secretaries.
	 */
	public List<Secretary> getAllSecretaries();
	
	/**
	 * @return The list of students.
	 */
	public List<Student> getAllStudents();
	
	/**
	 * @return The list of thesis.
	 */
	public List<Thesis> getAllThesis();	
	
	/**
	 * @return The list of committee members of a committee.
	 */
	public List<CommitteeMember> getCommitteeMembersOfCommittee(Committee nCommittee);		
	
	/**
	 * @param nMembers Members of the new committee.(2x Members + 1x President)
	 * @param nCommitteeSecretary Secretary of the committee.
	 * @return the id of the new committee.
	 */
	public int createCommittee(List<CommitteeMember> nMembers, Secretary nCommitteeSecretary);
		
	/**
	 * Adds a student to the exam table.
	 * @param nStudent Student to be added.
	 * @param nCoordinators Coordinators of the student.
	 * @return the id of the new student .
	 */
	public void enrollStudent(Student nStudent, List<Coordinator> nCoordinators);
	
	/**
	 * Adds a new catalog to the database.
	 * @param nCatalog The new catalog.
	 * @return the id of the new catalog.
	 */
	public void createCatalog(Catalog nCatalog);	
}
