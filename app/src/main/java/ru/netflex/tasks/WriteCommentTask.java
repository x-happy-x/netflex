package ru.netflex.tasks;

import lombok.extern.java.Log;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.netflex.server.auth.UserDto;
import ru.netflex.server.comments.Comment;
import ru.netflex.server.comments.CommentService;

import java.util.logging.Level;

@Log
@Component
@ExternalTaskSubscription("write-comment")
public class WriteCommentTask implements ExternalTaskHandler {

    private final CommentService commentService;

    @Autowired
    public WriteCommentTask(@Qualifier("getCommentService") CommentService commentService) {
        this.commentService = commentService;
    }


    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        log.log(Level.INFO, "WriteComment started");

        String commentText = externalTask.getVariable("comment");
        UserDto user = externalTask.getVariable("user");
        Long movieId = externalTask.getVariable("movieId");

        log.log(Level.INFO, "user: " + user.getUsername());
        log.log(Level.INFO, "comment: " + commentText);

        Comment comment = new Comment();
        comment.setText(commentText);
        comment.setUserId(user.getId());
        comment.setFilmId(movieId);
        comment = commentService.setFilmComment(comment);

        if (comment == null) {
            externalTaskService.handleBpmnError(externalTask, "401", "Invalid userId or movieId");
            return;
        }

        externalTaskService.complete(externalTask);
        log.log(Level.INFO, "WriteComment ended successfully");
    }
}
