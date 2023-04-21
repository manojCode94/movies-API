package com.kumarmanoj.services;

import com.kumarmanoj.entities.Movie;
import com.kumarmanoj.repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
//    @Autowired
//    private MovieRepository movieRepository;
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getSingleMovie(String id) {
//        return movieRepository.findById(id);
        return movieRepository.findMovieByImdbId(id);
    }
}
