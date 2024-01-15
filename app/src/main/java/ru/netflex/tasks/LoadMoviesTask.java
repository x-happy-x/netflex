package ru.netflex.tasks;

import lombok.extern.java.Log;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.netflex.server.movies.Movie;
import ru.netflex.server.movies.MovieService;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

@Log
@Component
@ExternalTaskSubscription("load-movies")
public class LoadMoviesTask implements ExternalTaskHandler {

    private final MovieService movieService;

    @Autowired
    public LoadMoviesTask(MovieService movieService) {
        this.movieService = movieService;
    }


    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        log.log(Level.INFO, "LoadMovies started");

        List<Movie> movies = movieService.getAllMovies();
        Map<String, Object> result = Collections.singletonMap("movies", movies);
        log.log(Level.INFO, "Count movies: " + movies.size());

        externalTaskService.complete(externalTask, result);
        log.log(Level.INFO, "LoadMovies completed");
    }
}
