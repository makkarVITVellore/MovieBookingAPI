package com.example.MovieTicket.MovieBooking.service;

import java.util.List;

import com.example.MovieTicket.MovieBooking.Model.Movie;

public interface MovieServiceInteface {
		
		public List<Movie> fetchAllMovies();
		
		public void addNewMovie(Movie movie);
		
		public Movie fetchMovieById(String id);
		
		public void removeMovieById(String id);
		
		public void updateMovieById(Movie movie, String id);
}
