package com.example.MovieTicket.MovieBooking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.MovieTicket.MovieBooking.Exceptions.IdAlreadyExist;
import com.example.MovieTicket.MovieBooking.Exceptions.IdNotFound;
import com.example.MovieTicket.MovieBooking.Model.Movie;

@Service
public class MovieService implements MovieServiceInteface {
	
	List<Movie> movieList = new ArrayList<>();
	HashMap<String,Movie> movieMap = new HashMap<>();
	
	@Override
	public List<Movie> fetchAllMovies() {
		return movieList;
	}

	@Override
	public void addNewMovie(Movie movie) {
		
		if(movieMap.containsKey(movie.getId()))
		{
			throw new IdAlreadyExist("A movie with id: " + movie.getId() + " already exists.");
		}
		
		movieList.add(movie);
		movieMap.put(movie.getId(),movie);
	}

	@Override
	public Movie fetchMovieById(String id) {
		
		Movie movie = movieMap.get(id);
		
		if(ObjectUtils.isEmpty(movie))
		{
			throw new IdNotFound("Movie of id: " + id + " not found.");
		}
		
		return movie;
	}

	@Override
	public void removeMovieById(String id) {
		
		
		if(ObjectUtils.isEmpty(movieMap.get(id)))
		{
			throw new IdNotFound("Movie of id: " + id + " not found.");
		}		
		
		Movie movie = fetchMovieById(id);
		movieList.remove(movie);
		movieMap.remove(id);

	}

	@Override
	public void updateMovieById(Movie movie, String id) {
		
		//get the existing movie object
		Movie existingMovie = movieMap.get(id);
		
		//remove this movie from the list and add new movie
		movieList.remove(existingMovie);
		movieList.add(movie);
		
		//put/update new movie in the map
		movieMap.put(existingMovie.getId(), movie);
		
	}

}
