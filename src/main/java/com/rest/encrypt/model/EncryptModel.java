package com.rest.encrypt.model;

import org.springframework.stereotype.Component;

@Component
public class EncryptModel {
    private String name;
    private String phoneNum;
    private String email;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private int pincode;
    private String aadhar;
    private String pan;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public String getAadhar() {
        return aadhar;
    }
    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }
    public String getPan() {
        return pan;
    }
    public void setPan(String pan) {
        this.pan = pan;
    }
    
    @Override
    public String toString() {
        return "EncryptJSON [name=" + name + ", phoneNum=" + phoneNum + ", email=" + email + ", addressLine1="
                + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", pincode=" + pincode
                + ", aadhar=" + aadhar + ", pan=" + pan + "]";
    }
    

}
