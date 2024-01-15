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

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

@Log
@Component
@ExternalTaskSubscription("load-movie")
public class LoadMovieTask implements ExternalTaskHandler {

    private final MovieService movieService;

    @Autowired
    public LoadMovieTask(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        log.log(Level.INFO, "LoadMovie started");

        Long movieId = externalTask.getVariable("movieId");
        log.log(Level.INFO, "movieId: " + movieId);

        Movie movie = movieService.getMovieById(movieId);
        Map<String, Object> result = new HashMap<>();
        result.put("movie", movie);
        log.log(Level.INFO, "Movie: " + movie.getTitles().get(0));

        externalTaskService.complete(externalTask, result);
        log.log(Level.INFO, "LoadMovie ended successfully");
    }
}
