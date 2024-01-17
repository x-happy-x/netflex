package ru.netflex.commentsserver.service;

import ru.netflex.commentsserver.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getFilmComments(Long filmId);
    Comment setFilmComment(Comment comment);
}
