package com.adaniak.socialmedia.api.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class User {
    private Integer id;
    @Size(min=2, message = "Name should have at least 2 characters")
    @JsonProperty("user_name")
    private String name;
    @Size(min=2, message = "Surname should have at least 2 characters")
    private String surname;
    private String country;
    @Past(message = "Membership date should be in the past")
    private LocalDate membershipDate;
    @Past(message = "Birth date date should be in the past")
    private LocalDate birthDate;

    public User(Integer id, String name, String surname, String country, LocalDate birthDate, LocalDate membershipDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.birthDate = birthDate;
        this.membershipDate = membershipDate;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(LocalDate membershipDate) {
        this.membershipDate = membershipDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", membershipDate=" + membershipDate +
                ", birthDate=" + birthDate +
                '}';
    }
}
