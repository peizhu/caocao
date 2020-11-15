package com.offcn.bean.controller;

import com.offcn.bean.bean.Movie;
import com.offcn.bean.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *MovieController
 *@author peizhu
 *@date 2020/10/7 21:12
 *@Version 1.0
 */
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    /**
     * 获取最新电影
     * @return
     */
    @GetMapping("/movie")
    public Movie getNewMovie(){
        return movieService.getNewMovie();
    }
}
