package com.sd.netflix;

import com.sd.netflix.entity.MovieEntity;
import com.sd.netflix.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("file:/home/ec2-user/props/netflix-${env}.properties")
@SpringBootApplication
@Slf4j
public class NetflixApplication {

	@Value("${env}")
	private String env;

	public static void main(String[] args) {
		SpringApplication.run(NetflixApplication.class, args);
	}

	@Bean
	CommandLineRunner run (MovieRepository movieRepository) {
		return  args -> {
			log.info("env is: {}", env);
			if (env.equals("dev")) {
				log.info("inserting data into dev DB");
				movieRepository.save(new MovieEntity(null, "Dont look up", "Movie", "Sci-fi", 2021, 4.50));
			}
		};
	}
}
