package com.desvsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desvsuperior.dsmovie.entities.Score;
import com.desvsuperior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

	
}
