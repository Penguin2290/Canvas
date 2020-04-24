package com.canvas.exception;

public class CanvasException extends Exception{
    String exceptionMessage ="";

    public CanvasException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
