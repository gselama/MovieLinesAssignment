package controller;

import java.util.concurrent.atomic.AtomicLong;


import entity.Movie;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MovieController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/movies/getByGenre")
    @ApiOperation(value = "Get only SB numbers based on engine model")
    public Movie getMoviesByGenre(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Movie(1, "Test","Test");
    }

    @GetMapping("/movies/getByYear")
    @ApiOperation(value = "Get only SB numbers based on engine model")
    public Movie getMoviesByYear(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Movie(1, "Test","Test");
    }

    @GetMapping("/movies/getByRating")
    @ApiOperation(value = "Get only SB numbers based on engine model")
    public Movie getMoviesByRating(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Movie(1, "Test","Test");
    }

    @GetMapping("/movies/getByName")
    @ApiOperation(value = "Get only SB numbers based on engine model")
    public Movie getMoviesByName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Movie(1, "Test","Test");
    }
}