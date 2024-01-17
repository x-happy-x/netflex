package ru.netflex.authserver.exception;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String msg) {
        super(msg);
    }
    public UserAlreadyExistsException(String msg, Throwable cause) {
        super(msg, cause);
    }
}