package com.offcn.bean.service;

import com.offcn.bean.bean.Movie;
import com.offcn.bean.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/*
 *MovieService
 *@author peizhu
 *@date 2020/10/7 21:11
 *@Version 1.0
 */
@Service
public class MovieService {
    @Autowired
    private MovieDao movieDao;
    @Value("${server.port}")
    private String port;

    public Movie getNewMovie() {
        System.out.println("当前电影服务的端口："+port);
        return movieDao.getNewMovie();
    }
}
