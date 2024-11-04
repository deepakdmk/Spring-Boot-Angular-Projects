package com.deeps.WeatherApp.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deeps.WeatherApp.user.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Integer>{

    UserEntity findByUsername(String username);
	
	UserEntity findByEmail(String email);


}
