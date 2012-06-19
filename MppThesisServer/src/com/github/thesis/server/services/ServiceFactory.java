package com.github.thesis.server.services;

import com.github.thesis.model.CommitteeSecretary;
import com.github.thesis.model.CouncilMember;
import com.github.thesis.model.Secretary;
import com.github.thesis.model.User;
import com.github.thesis.server.services.impl.CommitteeSecretaryService;
import com.github.thesis.server.services.impl.CouncilMemberService;
import com.github.thesis.server.services.impl.SecretaryService;

public class ServiceFactory {

	public static IBaseService getServiceForRole(User user) {
		
		if (user instanceof CouncilMember) {
			return new CouncilMemberService();
		} else if (user instanceof CommitteeSecretary) {
			return new CommitteeSecretaryService();
		} else if (user instanceof Secretary) {
			return new SecretaryService();
		}
		
		return null;
	}
}
