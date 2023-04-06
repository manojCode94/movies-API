package com.kumarmanoj.controllers;

import com.kumarmanoj.entities.Review;
import com.kumarmanoj.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
