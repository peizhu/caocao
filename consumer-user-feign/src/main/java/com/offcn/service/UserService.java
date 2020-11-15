package com.offcn.service;

import com.offcn.bean.Movie;
import com.offcn.bean.User;
import com.offcn.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/*
 *UserService
 *@author peizhu
 *@date 2020/10/7 21:26
 *@Version 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private MovieServiceFeign movieServiceFeign;
    /**
     * 根据ID得到用户对象
     *
     * @param id
     * @return
     */
    public User getUserById(Integer id) {
        User user = userDao.getUser(id);
        return user;
    }

    /**
     * 购买最新的电影票
     * @param id 用户ID
     * @return
     */
    public Map<String, Object> buyMovie(Integer id) {
        Map<String, Object> result = new HashMap<>();
        //1.查询用户信息
        User user = this.getUserById(id);
        result.put("user", user);
        //2.查到最新电影票
//      Movie movie=restTemplate.getForObject("http://ProviderMovie/movie",Movie.class);
        Movie movie = movieServiceFeign.getMovie();
        result.put("movie", movie);
        return result;
    }
}
