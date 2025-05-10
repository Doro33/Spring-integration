package com.example.ayande.base;

import com.example.ayande.dto.AyandeDto;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AyandeResponse {
    private String referenceId;
    private String code;
    private AyandeStatus status;
    private String errorMessage;
    private AyandeDto ayandeDto;

    public AyandeResponse() {
    }

    public AyandeResponse(AyandeDto ayandeDto) {
        if (ayandeDto==null)
            throw new NullPointerException("ayande cannot be null");
        setReferenceId();
        this.ayandeDto = ayandeDto;
        this.status=AyandeStatus.OK;
        setCode(status);
    }

    public AyandeResponse(AyandeStatus status, String errorMessage) {
        setReferenceId();
        this.status = status;
        setCode(status);
        this.errorMessage = errorMessage;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId() {
        this.referenceId = UUID.randomUUID().toString();
    }

    public String getCode() {
        return code;
    }

    public void setCode(AyandeStatus status) {
        if (status == AyandeStatus.OK)
            this.code = "0";
        if (status == AyandeStatus.INVALID_URL)
            this.code = "1";
        if (status == AyandeStatus.INVALID_ACCOUNT_NUMBER)
            this.code = "22";
        if (status == AyandeStatus.INVALID_SHEBA_NUMBER)
            this.code = "33";
        if (status==AyandeStatus.SHEBA_DOES_NOT_BELONG_TO_AYANDEH_BANK)
            code = "44";
        if (status == AyandeStatus.UNKNOWN_ERROR)
            this.code = "5";
    }

    public AyandeStatus getStatus() {
        return status;
    }

    public void setStatus(AyandeStatus status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public AyandeDto getAyandeDto() {
        return ayandeDto;
    }

    public void setAyandeDto(AyandeDto ayandeDto) {
        this.ayandeDto = ayandeDto;
    }

    @Override
    public String toString() {
        return "AyandeResponse{" +
                "referenceId='" + referenceId + '\'' +
                ", code='" + code + '\'' +
                ", status=" + status +
                ", errorMessage='" + errorMessage + '\'' +
                ", ayandeDto=" + ayandeDto +
                '}';
    }
}
