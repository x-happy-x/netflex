package ru.netflex.moviesserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netflex.moviesserver.entity.Genre;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {
}
