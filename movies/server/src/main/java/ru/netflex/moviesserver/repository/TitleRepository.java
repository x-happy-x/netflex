package ru.netflex.moviesserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netflex.moviesserver.entity.Title;

@Repository
public interface TitleRepository extends CrudRepository<Title, Long> {
}
