package com.sd.netflix;

import com.sd.netflix.entity.MovieEntity;
import com.sd.netflix.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

//@PropertySource("file:C:\\\\Code\\\\netflix-${env}.properties")
@SpringBootApplication
@Slf4j
public class NetflixApplication extends SpringBootServletInitializer {

    @Value("${env}")
    private String env;

    public static void main(String[] args) {
        SpringApplication.run(NetflixApplication.class, args);
    }

    @Bean
    CommandLineRunner run(MovieRepository movieRepository) {
        return args -> {
            log.info("env is: {}", env);
            if (env.equals("dev")) {
                log.info("inserting data into dev DB");
                movieRepository.save(new MovieEntity(null, "Dont look up", "Movie", "Sci-fi", 2021, 4.50));
                movieRepository.save(new MovieEntity(null, "RRR", "Movie", "Action", 2022, 4.30));
            } else if (env.equals("qa")) {
                log.info("inserting data into qa DB");
                movieRepository.save(new MovieEntity(null, "Dont look up", "Movie", "Sci-fi", 2021, 4.50));
                movieRepository.save(new MovieEntity(null, "RRR", "Movie", "Action", 2022, 4.30));
                movieRepository.save(new MovieEntity(null, "Red Notice", "Movie", "Action", 2021, 4.30));
            }
        };
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(NetflixApplication.class);
    }
}
