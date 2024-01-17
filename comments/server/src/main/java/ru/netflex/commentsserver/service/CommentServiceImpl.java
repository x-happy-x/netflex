package ru.netflex.commentsserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netflex.commentsserver.entity.Comment;
import ru.netflex.commentsserver.repository.CommentRepository;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    CommentRepository repository;

    @Autowired
    public CommentServiceImpl(CommentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Comment> getFilmComments(Long filmId) {
        return repository.getCommentsByFilmId(filmId);
    }

    @Override
    public Comment setFilmComment(Comment comment) {
        return repository.save(comment);
    }
}
