package ru.netflex.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import ru.netflex.client.CommentServiceImpl;
import ru.netflex.server.auth.AuthorisationService;
import ru.netflex.server.auth.WebServiceAuthorization;
import ru.netflex.server.comments.CommentService;
import ru.netflex.server.movies.MovieService;
import ru.netflex.server.movies.WebServiceMovie;

@Configuration
public class ClientServicesConfiguration {
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

    @Bean
    public CommentService getCommentService(WebClient.Builder builder) {
        return new CommentServiceImpl(builder);
    }

    @Bean
    public MovieService getMovieService() {
        WebServiceMovie webServiceMovie = new WebServiceMovie();
        return webServiceMovie.getMoviePort();
    }

    @Bean
    public AuthorisationService getAuthorisationService() {
        WebServiceAuthorization webServiceAuthorization = new WebServiceAuthorization();
        return webServiceAuthorization.getAuthorizationPort();
    }
}
