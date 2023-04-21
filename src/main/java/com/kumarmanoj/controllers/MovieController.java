package com.kumarmanoj.controllers;

import com.kumarmanoj.entities.Movie;
import com.kumarmanoj.services.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/movies")
public class MovieController {
//    @Autowired
//    private MovieService movieService;
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return  new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
    }

//    @GetMapping(path = "/id/{id}")
//    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id) {
//        Optional<Movie> movie = movieService.getSingleMovie(id);
//        return new ResponseEntity<Optional<Movie>>(movie, HttpStatus.OK);
//    }

    @RequestMapping(path = "/imdbid/{imdbid}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbid) {
        Optional<Movie> movie = movieService.getSingleMovie(imdbid);
        return new ResponseEntity<Optional<Movie>>(movie, HttpStatus.OK);
    }

}
