package ru.netflex.moviesserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netflex.moviesserver.entity.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    List<Movie> findAllByTitles_Title(String title);
    //List<Movie> findAllByTitles_TitleAndCountries(String title, String country);


}
