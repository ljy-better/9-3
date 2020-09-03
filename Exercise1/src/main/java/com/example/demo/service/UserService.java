package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    //List<User> queryByage(int age);

    User save(User user);

    void deletUserById(int id);
    List<User> queryById(int id);
}
