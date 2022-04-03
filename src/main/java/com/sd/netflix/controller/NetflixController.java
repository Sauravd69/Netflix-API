package com.sd.netflix.controller;

import com.sd.netflix.entity.MovieEntity;
import com.sd.netflix.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/netflix")
public class NetflixController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping(path="/search/all")
    public ResponseEntity<List<MovieEntity>> findAll() {
        List<MovieEntity> movies = movieRepository.findAll();
        return new ResponseEntity<List<MovieEntity>>(movies, new HttpHeaders(), HttpStatus.OK);
    }
}
