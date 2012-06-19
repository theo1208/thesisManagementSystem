package com.github.thesis.server.services;

import com.github.thesis.model.Committee;

/**
 * @author makranczitamas@gmail.com
 *
 */
public interface ICouncilMemberService extends IBaseService {

	public void createCommittee(Committee committee);
}
