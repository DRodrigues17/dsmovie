package com.desvsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desvsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	
}
