package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.RedisService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisService redisService;
    /*
    查询
     */
    @GetMapping("/queryById")
    public List<User> queryById(int id){
//        String userStr=redisService.get(id+"");
//        if(userStr==null){
//            redisService.set(id+"",userService.queryById(id).toString());
//            return userService.queryById(id).toString();
//        }
//        return userStr;

        return userService.queryById(id);
    }
    @PostMapping("/saveOrUpdate")
    public User saveOrUpdate(User user){
        return userService.save(user);
    }
    @PostMapping("/delete")
    public Boolean deleteUser(int id){
        userService.deletUserById(id);
        return true;
    }
}
