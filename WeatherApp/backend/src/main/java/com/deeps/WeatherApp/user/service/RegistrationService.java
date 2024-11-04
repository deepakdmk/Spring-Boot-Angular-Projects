package com.deeps.WeatherApp.user.service;

import org.springframework.stereotype.Service;

import com.deeps.WeatherApp.user.entity.UserEntity;
import com.deeps.WeatherApp.user.repository.UserRepo;

@Service
public class RegistrationService {

    private UserRepo userRepo;

    public RegistrationService(UserRepo springUserRepo) {
        userRepo = springUserRepo;
    }

    public UserEntity registerUser(UserEntity user) {
        return userRepo.save(user);
    }

    public boolean checkForDuplicateUsername(UserEntity view) {
        UserEntity entity = new UserEntity();
        entity = userRepo.findByUsername(view.getUsername());
        if (entity != null) {
            return true;
        }
        return false;
    }

    public boolean checkForDuplicateEmail(UserEntity view) {
        UserEntity entity = new UserEntity();
        entity = userRepo.findByEmail(view.getEmail());
        if (entity != null) {
            return true;
        }
        return false;
    }
}
