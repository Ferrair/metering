package com.adc.metering.bean;

public class Contact {
    private String name;
    private String position;
    private String contactNumber;
    private String fax;
    private String phoneNumber;
    private String email;

    public Contact(String name, String position, String contactNumber, String fax, String phoneNumber, String email) {
        this.name = name;
        this.position = position;
        this.contactNumber = contactNumber;
        this.fax = fax;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
