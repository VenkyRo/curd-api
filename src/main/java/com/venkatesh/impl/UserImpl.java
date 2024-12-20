package com.venkatesh.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.venkatesh.entity.User;
import com.venkatesh.repo.UserRepository;
import com.venkatesh.service.UserService;

@Service
public class UserImpl implements UserService {
	
	
	private UserRepository userRepository;
	

	public UserImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public String upsartUserData(User user) {
		
		Integer userId = user.getUid();
		
		String msg = "";
		
		userRepository.save(user);
		
		if(userId == null) {
			msg = "inserted sucessfully";
		}else {
			msg ="updated sucssfully";
		}
		
		return msg;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public String deleteUserById(Integer userId) {
		String msg = "User Dleted by Id "+userId+" Sucessfully";
		userRepository.deleteById(userId);
		return msg;
	}

	@Override
	public Optional<User> findUserById(Integer userId) {
		Optional<User> user = userRepository.findById(userId);
		return user;
	}

	

}
