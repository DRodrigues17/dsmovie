package com.desvsuperior.dsmovie.dto;

public class ScoreDTO {
	
	private long MovieId;
	private String email;
	private Double score;
	
	public ScoreDTO() {
		
	}

	public long getMovieId() {
		return MovieId;
	}

	public void setMovieId(long movieId) {
		MovieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	
}
