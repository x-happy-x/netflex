package ru.netflex.authserver.exception;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String msg) {
        super(msg);
    }
    public InvalidPasswordException(String msg, Throwable cause) {
        super(msg, cause);
    }
}