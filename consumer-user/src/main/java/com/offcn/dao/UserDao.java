package com.offcn.dao;

import com.offcn.bean.User;
import org.springframework.stereotype.Repository;

/*
 *UserDao
 *@author peizhu
 *@date 2020/10/7 21:25
 *@Version 1.0
 */
@Repository
public class UserDao {
    public User getUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUserName("张三");
        return user;
    }
}
