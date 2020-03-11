package com.codespace.task2_2;

public class InvalidAgeException extends RuntimeException {
    private String description;
    public InvalidAgeException (String description) {
        this.description = description;
    }
    @Override
    public String getMessage() {
        return this.description + "; " + super.getMessage();
    }
}
