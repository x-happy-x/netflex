package ru.netflex.authserver.endpoint;

import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.netflex.authserver.service.UserService;
import ru.netflex.authserver.service.web.AuthorisationService;

@Configuration
public class AuthorizationEndpoint {

    private final AuthorisationService service;
    private final Bus bus;

    @Autowired
    public AuthorizationEndpoint(Bus bus, AuthorisationService service) {
        this.bus = bus;
        this.service = service;
    }

    @Bean(name = "auth-endpoint")
    public Endpoint authorisationEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, service);
        endpoint.publish("/auth");
        return endpoint;
    }

}