package com.example.converttest.base.response;


import com.example.converttest.base.enums.Status;
import com.example.converttest.dto.FindPersonResponse;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CustomResponse {
    private String referenceId;
    private String code;
    private Status status;
    private String errorMessage;
    private FindPersonResponse person;


    public CustomResponse() {
    }

    public CustomResponse(Status status, String errorMessage) {
        setReferenceId();
        this.status = status;
        setCode(status);
        this.errorMessage = errorMessage;
        this.person = null;
    }

    public CustomResponse(FindPersonResponse person) {
        if (person != null) {
            setReferenceId();
            this.status = Status.OK;
            setCode(status);
            this.person = person;
        }else throw new NullPointerException("person cannot be null");
    }

    public void setReferenceId() {
        this.referenceId = UUID.randomUUID().toString();
    }

    private void setCode(Status status) {
        if (status == Status.OK)
            this.code = "0";
        if (status == Status.INVALID_URL)
            this.code = "1";
        if (status == Status.INVALID_ID)
            this.code = "2";
        if (status == Status.SITE_DOES_NOT_RESPONSE)
            this.code = "3";
        if (status == Status.CANNOT_CONVERT_XML_TO_JSON)
            this.code = "4";
        if (status == Status.UNKNOWN_ERROR)
            this.code = "5";
    }


    public String getReferenceId() {
        return referenceId;
    }

    public String getCode() {
        return code;
    }

    public Status getStatus() {
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
