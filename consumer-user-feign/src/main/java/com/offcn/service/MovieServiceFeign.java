package com.offcn.service;

import com.offcn.bean.Movie;
import com.offcn.exception.MovieFeignExceptionHandlerService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*
 *MovieServiceFeign
 *@author peizhu
 *@date 2020/10/7 22:02
 *@Version 1.0
 */
@FeignClient(value = "ProviderMovie",fallback = MovieFeignExceptionHandlerService.class)
public interface MovieServiceFeign {
    @GetMapping("/movie")
    public Movie getMovie();
}
