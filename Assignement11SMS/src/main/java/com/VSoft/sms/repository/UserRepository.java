package com.VSoft.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VSoft.sms.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findUserByUsernameAndPassword(String username, String password);
	
}
