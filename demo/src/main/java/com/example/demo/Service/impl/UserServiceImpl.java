package com.example.demo.Service.impl;

import com.example.demo.Entities.Users;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(Users users) {
        userRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Users updateUsers(Users users) {
        userRepository.save(users);
        return users;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Users getUserById(Long id) {
        return userRepository.findById(id).get();
    }
}
