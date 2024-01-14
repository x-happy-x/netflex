package ru.netflex;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;
import lombok.Getter;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import ru.netflex.server.movies.*;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.*;

@Log
class MoviesClientTest {
    @Getter
    static class AsyncMoviesHandler implements AsyncHandler<GetAllMoviesResponse> {
        GetAllMoviesResponse response;

        @Override
        public void handleResponse(Response<GetAllMoviesResponse> response) {
            try {
                this.response = response.get(2000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException | TimeoutException | InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    void testAsyncMethod1() {
        WebServiceMovie webServiceMovie = new WebServiceMovie();
        MovieService service = webServiceMovie.getMoviePort();


        // Method 1
        AsyncMoviesHandler asyncHandler = new AsyncMoviesHandler();
        Future<?> futureResponse = service.getAllMoviesAsync(asyncHandler);

        while (!futureResponse.isDone()) {
            try {
                System.out.println("Method 1. Waiting...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        List<Movie> movies = asyncHandler.getResponse().getReturn();
        print(movies);
    }

    @Test
    void testAsyncMethod2() {
        WebServiceMovie webServiceMovie = new WebServiceMovie();
        MovieService service = webServiceMovie.getMoviePort();


        // Method 1
        Response<GetAllMoviesResponse> response = service.getAllMoviesAsync();

        while (!response.isDone()) {
            try {
                System.out.println("Method 2. Waiting...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            List<Movie> movies = response.get().getReturn();
            print(movies);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void addMovie() {
        WebServiceMovie webServiceMovie = new WebServiceMovie();
        MovieService service = webServiceMovie.getMoviePort();

        Movie movie = new Movie();
        movie.setDirector("Robert W.");
        movie.setAgeLimit(18);

        Title title = new Title();
        title.setTitle("Покемоны");
        movie.getTitles().add(title);

        Genre genre = new Genre();
        genre.setName("Боевик");
        movie.getGenres().add(genre);
        movie = service.saveMovie(movie);
        log.log(Level.INFO, movie.getId()+" created");
    }

    public void print(List<Movie> movies) {
        if (movies.isEmpty()) {
            log.log(Level.INFO, "No movies found");
            return;
        }

        for (Movie movie : movies) {
            log.log(Level.INFO, "Movie: " + movie.getId());
            for (Title title2 : movie.getTitles()) {
                log.log(Level.INFO, "Title: " + title2.getTitle() + "\n");
            }
        }
    }
}