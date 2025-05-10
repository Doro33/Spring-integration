package com.example.converttest.base.response;


import com.example.converttest.base.enums.ConvertStatus;
import com.example.converttest.dto.FindPersonResponse;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CustomResponse {
    private String referenceId;
    private String code;
    private ConvertStatus status;
    private String errorMessage;
    private FindPersonResponse person;


    public CustomResponse() {
    }

    public CustomResponse(ConvertStatus status, String errorMessage) {
        setReferenceId();
        this.status = status;
        setCode(status);
        this.errorMessage = errorMessage;
        this.person = null;
    }

    public CustomResponse(FindPersonResponse person) {
        if (person == null)
            throw new NullPointerException("person cannot be null");
        setReferenceId();
        this.status = ConvertStatus.OK;
        setCode(status);
        this.person = person;
    }

    public void setReferenceId() {
        this.referenceId = UUID.randomUUID().toString();
    }

    public String getReferenceId() {
        return referenceId;
    }

    private void setCode(ConvertStatus convertStatus) {
        if (convertStatus == ConvertStatus.OK)
            this.code = "0";
        if (convertStatus == ConvertStatus.INVALID_URL)
            this.code = "1";
        if (convertStatus == ConvertStatus.INVALID_ID)
            this.code = "2";
        if (convertStatus == ConvertStatus.SITE_DOES_NOT_RESPONSE)
            this.code = "3";
        if (convertStatus == ConvertStatus.CANNOT_CONVERT_XML_TO_JSON)
            this.code = "4";
        if (convertStatus == ConvertStatus.UNKNOWN_ERROR)
            this.code = "5";
    }

    public String getCode() {
        return code;
    }

    public ConvertStatus getStatus() {
        return status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public FindPersonResponse getPerson() {
        return person;
    }

    public void setPerson(FindPersonResponse person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "CustomResponse{" +
                "referenceId='" + referenceId + '\'' +
                ", code='" + code + '\'' +
                ", status=" + status +
                ", errorMessage='" + errorMessage + '\'' +
                ", person=" + person +
                '}';
    }
}
