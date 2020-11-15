package com.offcn.controller;

import com.offcn.bean.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
 *UserController
 *@author peizhu
 *@date 2020/10/7 21:27
 *@Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(@RequestParam("id") Integer id) {
        User user = userService.getUserById(id);
        return user;
    }

    @GetMapping("/buyMovie")
    public Map<String, Object> buyMovie(@RequestParam("id") Integer userId) {
        Map<String, Object> map = userService.buyMovie(userId);
        return map;
    }
}
