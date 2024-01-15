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

import java.util.logging.Level;

@Log
@Component
@ExternalTaskSubscription("check-movie")
public class CheckMovieTask implements ExternalTaskHandler {

    private final MovieService movieService;

    @Autowired
    public CheckMovieTask(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        log.log(Level.INFO, "CheckMovie started");

        Long movieId = externalTask.getVariable("movieId");
        log.log(Level.INFO, "movieId: " + movieId);

        Movie movie = movieService.getMovieById(movieId);
        if (movie == null) {
            log.log(Level.INFO, "CheckMovie not found movie");
            externalTaskService.handleBpmnError(externalTask, "404", "Movie not found");
            return;
        }

        externalTaskService.complete(externalTask);
        log.log(Level.INFO, "CheckMovie ended successfully");
    }
}
