package com.vitorgabrielti.desafiopicpay.transaction;

public class InvalidTransactionException extends RuntimeException {

    public InvalidTransactionException(String message) {
        super(message);
    }

}
