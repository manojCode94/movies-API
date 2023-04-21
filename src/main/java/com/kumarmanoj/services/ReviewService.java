package com.kumarmanoj.services;

import com.kumarmanoj.entities.Movie;
import com.kumarmanoj.entities.Review;
import com.kumarmanoj.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
//    @Autowired
//    private ReviewRepository reviewRepository;

    private final ReviewRepository reviewRepository;
    private final MongoTemplate mongoTemplate;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository, MongoTemplate mongoTemplate) {
        this.reviewRepository = reviewRepository;
        this.mongoTemplate = mongoTemplate;
    }

    //This is the other way to perform and talk with the database just like JdbcTemplate
//    @Autowired
//    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbId) {
        //insert it to the database to the relevant movie
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return  review;
    }

}
