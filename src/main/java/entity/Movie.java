package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Movie {

    @Id
    @Column(name = "movieid")
    private final long movieId;
    @Column(name = "title")
    private final String title;
    @Column(name = "genre")
    private final String genre;

    @OneToMany(fetch = FetchType.LAZY,mappedBy="ratings",cascade=CascadeType.ALL)
    @JsonIgnoreProperties("ratings")
    private Set<Rating> ratings = new HashSet<Rating>();

    @OneToMany(fetch = FetchType.LAZY,mappedBy="tags",cascade=CascadeType.ALL)
    @JsonIgnoreProperties("tags")
    private Set<Tag> tags = new HashSet<Tag>();

    @OneToMany(fetch = FetchType.LAZY,mappedBy="links",cascade=CascadeType.ALL)
    @JsonIgnoreProperties("links")
    private Set<Link> links = new HashSet<Link>();

    @OneToMany(fetch = FetchType.LAZY,mappedBy="gnomeScores",cascade=CascadeType.ALL)
    @JsonIgnoreProperties("gnomeScores")
    private Set<GnomeScore> gnomeScores = new HashSet<GnomeScore>();

    public Movie(long movieId, String title, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
    }

    public long getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Set<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<Rating> ratings) {
        this.ratings = ratings;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Set<Link> getLinks() {
        return links;
    }

    public void setLinks(Set<Link> links) {
        this.links = links;
    }

    public Set<GnomeScore> getGnomeScores() {
        return gnomeScores;
    }

    public void setGnomeScores(Set<GnomeScore> gnomeScores) {
        this.gnomeScores = gnomeScores;
    }
}