package com.mybatisDemo.controller;

import com.mybatisDemo.entity.Info;
import com.mybatisDemo.entity.User;
import com.mybatisDemo.mapper.InfoMapper;
import com.mybatisDemo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    InfoMapper infoMapper;

    @Autowired
    UserMapper userMapper;

    @PostMapping (value = "getJson")
    public String getJson(@RequestBody String jsonData) {
        System.out.println(jsonData);
        return jsonData;
    }

    @PostMapping (value = "/getJsonData")
    public String getJson1(@RequestBody User user) {
        System.out.println(user);
        return user.toString();
    }

    @PostMapping(value = "/save1")
    public String save1(@RequestBody User user) {
        for (int i=0 ;i<10;i++) {
            userMapper.insertUser(user);
        }
        return user.toString();
    }
    @PostMapping(value = "/getUser")
    public String getUser(@RequestBody Info info) {
        System.out.println(info);
        infoMapper.insertInfo(info);
        return info.toString();
    }


}
