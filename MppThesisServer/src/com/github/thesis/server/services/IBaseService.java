package com.github.thesis.server.services;

import com.github.thesis.model.User;

/**
 * @author makranczitamas@gmail.com
 *
 */
public interface IBaseService {
	
	public User login(String username, String password);
	public boolean logout(User user);
	
	
	
}
