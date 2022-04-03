package com.sd.netflix.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="movies")
@Data @NoArgsConstructor @AllArgsConstructor
public class MovieEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String type;
	private String genre;
	private int publish_year;
	private double rating;
}
