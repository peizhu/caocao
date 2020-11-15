package com.offcn.bean.bean;

import java.io.Serializable;

/*
 *MovieBean
 *@author peizhu
 *@date 2020/10/7 20:45
 *@Version 1.0
 */
public class Movie implements Serializable {
    private Integer id;
    private String movieName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
