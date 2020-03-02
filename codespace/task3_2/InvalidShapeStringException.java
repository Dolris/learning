package com.codespace.task3_2;

public class InvalidShapeStringException extends RuntimeException {
    private String description;
    @Override
    public String getMessage() {
        return this.description;
    }
        public InvalidShapeStringException(String description) {
            this.description = description;
        }
}