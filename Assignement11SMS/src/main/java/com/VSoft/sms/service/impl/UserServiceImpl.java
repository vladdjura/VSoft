package com.VSoft.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VSoft.sms.model.User;
import com.VSoft.sms.repository.UserRepository;
import com.VSoft.sms.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository repository;
	@Autowired
	public UserServiceImpl(UserRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		User u = repository.findUserByUsernameAndPassword(username, password);
		return u;
	}

}
