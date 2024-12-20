package com.venkatesh.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkatesh.entity.User;

public interface UserRepository  extends JpaRepository<User, Serializable>{

}
