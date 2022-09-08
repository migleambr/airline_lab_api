package com.example.airline_lab.models;

public class Passenger {

    private Long id;
    private String name;
    private String emailAddress;

    public Passenger(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public Passenger() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
