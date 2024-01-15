package ru.netflex.tasks;

import lombok.extern.java.Log;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.netflex.server.auth.*;

import java.util.logging.Level;

@Log
@Component
@ExternalTaskSubscription("registration")
public class RegistrationTask implements ExternalTaskHandler {

    private final AuthorisationService authorisationService;

    @Autowired
    public RegistrationTask(AuthorisationService authorisationService) {
        this.authorisationService = authorisationService;
    }

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        log.log(Level.INFO, "Registration started");

        String username = externalTask.getVariable("username");
        String password = externalTask.getVariable("password");

        log.log(Level.INFO, "username: " + username);
        log.log(Level.INFO, "password: " + password);

        UserRegistrationDto registrationDto = new UserRegistrationDto();
        registrationDto.setUsername(username);
        registrationDto.setPassword(password);

        try {
            authorisationService.registration(registrationDto);
            externalTaskService.complete(externalTask);
            log.log(Level.INFO, "Registration ended successfully");
        } catch (InvalidUsernameException_Exception e) {
            externalTaskService.handleBpmnError(externalTask, "401", e.getLocalizedMessage());
            log.log(Level.INFO, "Registration invalid username");
        } catch (InvalidPasswordException_Exception e) {
            externalTaskService.handleBpmnError(externalTask, "401", e.getLocalizedMessage());
            log.log(Level.INFO, "Registration invalid password");
        } catch (UserAlreadyExistsException_Exception e) {
            externalTaskService.handleBpmnError(externalTask, "401", e.getLocalizedMessage());
            log.log(Level.INFO, "Registration user already exists");
        }
    }
}
