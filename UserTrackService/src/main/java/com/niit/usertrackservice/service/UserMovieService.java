package com.niit.usertrackservice.service;

import com.niit.usertrackservice.domain.Movie;
import com.niit.usertrackservice.domain.User;
import com.niit.usertrackservice.exception.MovieNotFoundException;
import com.niit.usertrackservice.exception.UserAlreadyExistsException;
import com.niit.usertrackservice.exception.UserNotFoundException;

import java.util.List;

public interface UserMovieService {
User registerUser(User user) throws UserAlreadyExistsException;
User saveUserMovieToList(Movie movie,String email) throws UserNotFoundException;
User deleteUserMovieFromList(String email,String movieId) throws UserNotFoundException, MovieNotFoundException;
List<Movie> getAllUserMovies(String email) throws UserNotFoundException;
List<Movie> getAllMoviesByGenre(String genre);
List<Movie> getAllMovies();
}
