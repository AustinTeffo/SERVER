package com.example.Server.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("PERSONS")
public class User {
    @Id
    private Integer Id;
    private String surname;
    private String name;
    private String Address;
    private Integer Age;
    private String email;
    private String password;
    private String accountnumber;
    private String medicalaidnumber;
    private String phone;
    private String medicalaidtype;
    private String carinsurancetype;
    private Integer medicalaidbalance;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getMedicalaidnumber() {
        return medicalaidnumber;
    }

    public void setMedicalaidnumber(String medicalaidnumber) {
        this.medicalaidnumber = medicalaidnumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMedicalaidtype() {
        return medicalaidtype;
    }

    public void setMedicalaidtype(String medicalaidtype) {
        this.medicalaidtype = medicalaidtype;
    }

    public String getCarinsurancetype() {
        return carinsurancetype;
    }

    public void setCarinsurancetype(String carinsurancetype) {
        this.carinsurancetype = carinsurancetype;
    }

    public Integer getMedicalaidbalance() {
        return medicalaidbalance;
    }

    public void setMedicalaidbalance(Integer medicalaidbalance) {
        this.medicalaidbalance = medicalaidbalance;
    }


    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", Age=" + Age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", medicalaidnumber='" + medicalaidnumber + '\'' +
                ", phone='" + phone + '\'' +
                ", medicalaidtype='" + medicalaidtype + '\'' +
                ", carinsurancetype='" + carinsurancetype + '\'' +
                ", medicalaidbalance=" + medicalaidbalance +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
