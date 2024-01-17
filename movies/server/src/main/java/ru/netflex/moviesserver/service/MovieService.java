package ru.netflex.moviesserver.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import ru.netflex.moviesserver.entity.Movie;

import java.util.List;

@WebService
public interface MovieService {

    @WebMethod
    Movie saveMovie(Movie movie);

    @WebMethod
    Movie getMovieById(Long id);

    @WebMethod
    List<Movie> getMovieByTitle(String title);

    @WebMethod
    List<Movie> getAllMovies();

    @WebMethod
    void deleteMovie(Long id);

    @WebMethod
    Movie updateMovie(Movie movie);
}
