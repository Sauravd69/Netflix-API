package com.sd.netflix;

import com.sd.netflix.controller.NetflixController;
import com.sd.netflix.entity.MovieEntity;
import com.sd.netflix.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(NetflixController.class)
public class NetflixControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    MovieRepository movieRepository;

    MovieEntity record1 = new MovieEntity(null, "Dont look up", "Movie", "Sci-fi", 2021, 4.50);

    @Test
    public void testFindAll() throws Exception {
        List<MovieEntity> records = new ArrayList<>(Arrays.asList(record1));

        Mockito.when(movieRepository.findAll()).thenReturn(records);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/search/all")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is("Dont look up")));
    }
}
