package controller;


import entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class PipelineController {

    @GetMapping("/pipeline/movies")
    public Movie loadMovie(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Movie(1, "Test","Test");
    }

    @GetMapping("/pipeline/link")
    public Movie loadLink(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Movie(1, "Test","Test");
    }

    @GetMapping("/pipeline/rating")
    public Movie loadRating(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Movie(1, "Test","Test");
    }

    @GetMapping("/pipeline/tag")
    public Movie loadTag(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Movie(1, "Test","Test");
    }

    @GetMapping("/pipeline/genometag")
    public Movie loadGenomeTag(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Movie(1, "Test","Test");
    }

    @GetMapping("/pipeline/gnomescore")
    public Movie loadGnomeScore(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Movie(1, "Test","Test");
    }
}
