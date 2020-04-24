package com.canvas.exception;

/**
 * User defined Checked Exception for the application
 */
public class CanvasException extends Exception{
    String exceptionMessage ="";

    public CanvasException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }
}
