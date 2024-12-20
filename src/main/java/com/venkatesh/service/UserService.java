package com.venkatesh.service;

import java.util.List;
import java.util.Optional;

import com.venkatesh.entity.User;


public interface UserService {
	
	public String upsartUserData(User user);
	
	public List<User> getAllUsers();
	
	public String deleteUserById(Integer userId);
	
	public Optional<User> findUserById(Integer userId);

}
