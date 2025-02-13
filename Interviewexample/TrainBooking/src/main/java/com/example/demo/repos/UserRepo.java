package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitys.UserEntity;
import java.util.List;


public interface UserRepo extends JpaRepository<UserEntity, Integer>{
	
	
	public UserEntity findByFirstNameAndLastNameAndEmailAddress(String firstName,String lastName,String emailAddress);

}
