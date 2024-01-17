package ru.netflex.authserver.exception;

public class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String msg) {
        super(msg);
    }
    public InvalidUsernameException(String msg, Throwable cause) {
        super(msg, cause);
    }
}