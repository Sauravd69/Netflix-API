package com.sd.netflix;

import com.sd.netflix.entity.MovieEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MovieEntityTests {

    @Test
    void testMovieEntity() {
        MovieEntity record1 = new MovieEntity(1L, "Dont look up", "Movie", "Sci-fi", 2021, 4.50);

        MovieEntity movieEntity = MovieEntity.builder()
                .id(1L)
                .name("Dont look up")
                .type("Movie")
                .genre("Sci-fi")
                .publish_year(2021)
                .rating(4.50)
                .build();
        assertEquals(movieEntity, record1);
    }

    @Test
    void testMovieEntity2() {
        MovieEntity record1 = new MovieEntity();

        MovieEntity movieEntity = MovieEntity.builder()
                .id(null)
                .name(null)
                .type(null)
                .genre(null)
                .publish_year(0)
                .rating(0.0)
                .build();
        assertEquals(record1, movieEntity);
    }
}
