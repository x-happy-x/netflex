package ru.netflex.tasks;

import lombok.extern.java.Log;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.netflex.server.auth.*;

import java.util.Collections;
import java.util.logging.Level;

@Log
@Component
@ExternalTaskSubscription("check-auth")
public class CheckAuthorizationTask implements ExternalTaskHandler {

    private final AuthorisationService authorisationService;

    @Autowired
    public CheckAuthorizationTask(AuthorisationService authorisationService) {
        this.authorisationService = authorisationService;
    }

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        log.log(Level.INFO, "CheckAuthorization started");

        String username = externalTask.getVariable("username");
        String password = externalTask.getVariable("password");

        log.log(Level.INFO, "username: " + username);
        log.log(Level.INFO, "password: " + password);

        UserAuthorizationDto authorizationDto = new UserAuthorizationDto();
        authorizationDto.setUsername(username);
        authorizationDto.setPassword(password);
        try {
            UserDto user = authorisationService.authorization(authorizationDto);
            externalTaskService.complete(externalTask, Collections.singletonMap("user", user));
            log.log(Level.INFO, "CheckAuthorization ended successfully");
        } catch (InvalidPasswordException_Exception e) {
            externalTaskService.handleBpmnError(externalTask, "401", e.getLocalizedMessage());
            log.log(Level.INFO, "CheckAuthorization invalid password");
        } catch (UsernameNotFoundException_Exception e) {
            externalTaskService.handleBpmnError(externalTask, "404", e.getLocalizedMessage());
            log.log(Level.INFO, "CheckAuthorization not found username");
        }
    }
}
