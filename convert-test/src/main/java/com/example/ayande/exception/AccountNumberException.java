package com.example.ayande.exception;

public class AccountNumberException extends IllegalStateException{
    public AccountNumberException() {
        super("Account number must have exactly 13 digits.");
    }
}
