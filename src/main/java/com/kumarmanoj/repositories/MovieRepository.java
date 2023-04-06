package com.kumarmanoj.repositories;

import com.kumarmanoj.entities.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //automated queries - get the information by property name

    Optional<Movie> findMovieByImdbId(String imdbId);
}
