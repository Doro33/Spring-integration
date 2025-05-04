package com.example.converttest.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FindPersonResponse", namespace = "http://tempuri.org")
public class FindPersonResponse {

    private FindPersonResult findPersonResult;

    @XmlElement(name = "FindPersonResult", namespace = "http://tempuri.org")
    public FindPersonResult getFindPersonResult() {
        return findPersonResult;
    }

    public void setFindPersonResult(FindPersonResult findPersonResult) {
        this.findPersonResult = findPersonResult;
    }

    @Override
    public String toString() {
        return "FindPersonResponse{" +
                "findPersonResult= " + findPersonResult +
                '}';
    }
}

