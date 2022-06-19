package com.example.demo.Service;

import com.example.demo.Entities.Users;

import java.util.List;

public interface UserService {

    void addUser(Users users);
    List <Users> getAllUsers();
    Users updateUsers(Users users);
    void deleteUser(Long id);
    Users getUserById(Long id);
}
