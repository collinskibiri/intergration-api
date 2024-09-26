package com.collins.socket.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserModel {
    @JsonProperty
    private  String name;
    @JsonProperty
    private    String firstName;
    @JsonProperty
    private  String secondName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
