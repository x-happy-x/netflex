package ru.netflex.moviesserver.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netflex.moviesserver.entity.Movie;
import ru.netflex.moviesserver.repository.MovieRepository;

import java.util.List;

@Service
@WebService(serviceName = "WebServiceMovie", portName = "MoviePort")
public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository;

    @Autowired
    public MovieServiceImpl(MovieRepository repository) {
        this.repository = repository;
    }

    @WebMethod()
    public Movie saveMovie(Movie movie) {
        return repository.save(movie);
    }

    @WebMethod
    public Movie getMovieById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @WebMethod
    public List<Movie> getMovieByTitle(String title) {
        return repository.findAllByTitles_Title(title);
    }

    @WebMethod
    public List<Movie> getAllMovies() {
        return (List<Movie>) repository.findAll();
    }

    @WebMethod
    public void deleteMovie(Long id) {
        repository.deleteById(id);
    }

    @WebMethod
    public Movie updateMovie(Movie movie) {
        return repository.save(movie);
    }
}
