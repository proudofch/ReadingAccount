package com.ra.persistence;

import org.springframework.data.repository.CrudRepository;

import com.ra.vo.User;

public interface UserRepository extends CrudRepository<User, String> {
	
}
