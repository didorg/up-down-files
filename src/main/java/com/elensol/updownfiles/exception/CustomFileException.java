package com.elensol.updownfiles.exception;

public class CustomFileException extends RuntimeException {
    public CustomFileException(String message) {
        super(message);
    }

    public CustomFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
