package ru.netflex.commentsserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.netflex.commentsserver.entity.Comment;
import ru.netflex.commentsserver.service.CommentService;

import java.util.List;

@Controller
public class CommentController {

    CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping("/comment")
    public ResponseEntity<List<Comment>> getFilmComments(@RequestParam Long filmId) {
        return ResponseEntity.ok(service.getFilmComments(filmId));
    }

    @PostMapping("/comment")
    public ResponseEntity<Comment> setFilmComment(@RequestBody Comment comment) {
        return ResponseEntity.ok(service.setFilmComment(comment));
    }
}
