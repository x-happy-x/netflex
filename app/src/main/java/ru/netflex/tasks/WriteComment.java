package ru.netflex.tasks;

import lombok.extern.java.Log;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.netflex.server.comments.Comment;
import ru.netflex.server.comments.CommentService;
import ru.netflex.server.movies.Movie;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

@Log
@Component
@ExternalTaskSubscription("write-comment")
public class WriteComment implements ExternalTaskHandler {

    private final CommentService commentService;

    @Autowired
    public WriteComment(@Qualifier("getCommentService") CommentService commentService) {
        this.commentService = commentService;
    }


    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        log.log(Level.INFO, "WriteComment started");

        Long movieId = externalTask.getVariable("movieId");
        log.log(Level.INFO, "movieId: " + movieId);

        List<Comment> comments = commentService.getFilmComments(movieId);
        Map<String, Object> result = Collections.singletonMap("comments", comments);
        log.log(Level.INFO, "Count comments: " + comments.size());

        externalTaskService.complete(externalTask, result);
        log.log(Level.INFO, "WriteComment ended successfully");
    }
}
