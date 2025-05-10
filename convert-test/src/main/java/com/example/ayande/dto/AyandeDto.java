package com.example.ayande.dto;

import com.example.ayande.exception.AccountNumberException;
import com.example.ayande.exception.ShebaNumberException;

public class AyandeDto {
    private String accountNumber;
    private String shebaNumber;

    public AyandeDto() {
    }

    public AyandeDto(String accountNumber, String shebaNumber) {
       setAccountNumber(accountNumber);
       setShebaNumber(shebaNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (!accountNumber.matches("^\\d{13}$"))
            throw new AccountNumberException();
        this.accountNumber = accountNumber;
    }

    public String getShebaNumber() {
        return shebaNumber;
    }

    public void setShebaNumber(String shebaNumber) {
        if (!shebaNumber.matches("^IR\\d{24}$"))
            throw new ShebaNumberException();
        this.shebaNumber = shebaNumber;
    }
}
