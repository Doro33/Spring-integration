package com.example.ayande.exception;

public class ShebaNumberException extends IllegalStateException{
    public ShebaNumberException() {
        super("Sheba must start with IR and have exactly 24 digits after that.");
    }
}
