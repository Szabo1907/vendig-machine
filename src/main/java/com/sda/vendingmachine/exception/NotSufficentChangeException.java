package com.sda.vendingmachine.exception;

public class NotSufficentChangeException extends RuntimeException {

    public NotSufficentChangeException(String message){
        super(message);
    }
}
