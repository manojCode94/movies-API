package com.kumarmanoj.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Document(collection = "movies")
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    //this will be embedded relationship One movies can have many reviews (one to many)
    @DocumentReference
    private List<Review> reviewIds;

    public Movie() {
    }

    public Movie(ObjectId id, String imdb, String title, String releaseDate, String trailerLink, String poster, List<String> genres, List<String> backdrop, List<Review> reviewIds) {
        this.id = id;
        this.imdbId = imdb;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.genres = genres;
        this.backdrops = backdrop;
        this.reviewIds = reviewIds;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getImdb() {
        return imdbId;
    }

    public void setImdb(String imdb) {
        this.imdbId = imdb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getBackdrop() {
        return backdrops;
    }

    public void setBackdrop(List<String> backdrop) {
        this.backdrops = backdrop;
    }

    public List<Review> getReviewIds() {
        return reviewIds;
    }

    public void setReviewIds(List<Review> reviewIds) {
        this.reviewIds = reviewIds;
    }
}
