package com.sda.vendingmachine.exception;

public class NotFullPaydException extends RuntimeException {
    public NotFullPaydException(String message) {
        super(message);
    }

}
