package ru.netflex.moviesserver.endpoint;

import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netflex.moviesserver.service.MovieService;
import ru.netflex.moviesserver.service.MovieServiceImpl;

@Configuration
public class MovieEndpoint {

    private final MovieService service;
    private final Bus bus;

    @Autowired
    public MovieEndpoint(Bus bus, MovieService service) {
        this.bus = bus;
        this.service = service;
    }

    @Bean(name = "movie-endpoint")
    public Endpoint movieEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, service);
        endpoint.publish("movies");
        return endpoint;
    }

}