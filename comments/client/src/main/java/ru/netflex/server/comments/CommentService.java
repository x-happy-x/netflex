package ru.netflex.server.comments;

import java.util.List;

public interface CommentService {
    List<Comment> getFilmComments(Long filmId);
    Comment setFilmComment(Comment comment);
}
