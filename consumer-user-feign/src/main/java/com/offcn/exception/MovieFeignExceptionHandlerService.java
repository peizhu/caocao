package com.offcn.exception;

import com.offcn.bean.Movie;
import com.offcn.service.MovieServiceFeign;
import org.springframework.stereotype.Component;

/*
 *MovieFeignExceptionHandlerService
 *@author peizhu
 *@date 2020/10/7 22:28
 *@Version 1.0
 */
@Component
public class MovieFeignExceptionHandlerService implements MovieServiceFeign {
    @Override
    public Movie getMovie() {
        Movie movie = new Movie();
        movie.setId(-100);
        movie.setMovieName("无此电影呀...");
        return movie;
    }
}
