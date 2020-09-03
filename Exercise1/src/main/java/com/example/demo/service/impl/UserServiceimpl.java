package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService{
    @Autowired
    private UserDao userDao;

    //@Override
    //public List<User> queryByage(int age){
    //    return userDao.findByAge(age);
    //}
    @Override
    public User save(User user){
        return userDao.save(user);
    }
    @Override
    public void deletUserById(int id){
        userDao.deleteById(id);
    }
    @Override
    public List<User> queryById(int id) {
        return userDao.findById(id);
    }
}
