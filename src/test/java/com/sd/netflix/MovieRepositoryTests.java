package com.sd.netflix;

import com.sd.netflix.entity.MovieEntity;
import com.sd.netflix.repository.MovieRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MovieRepositoryTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    MovieRepository movieRepository;

    @Before("")
    void setup() {
        movieRepository.save(new MovieEntity(null, "Dont look up", "Movie", "Sci-fi", 2021, 4.50));
    }

    @Test
    void testRepo() {
        assertNotNull(movieRepository.findById(1L).get());
    }
}
