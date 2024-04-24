package com.swe.hw3.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;
@Entity
@Table(name="surveyTable")
public class SurveyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "street_address")
    private String streetadd;


    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip_code")
    private int zip;

    @Column(name = "telephone_number")
    private String telephone;

    @Column(name = "email")
    private String email;

    @Column(name = "date_of_survey")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date;

    @Column(name = "most_liked")
    private String liked;

    @Column(name = "heard_from")
    private String intrest;

    @Column(name = "if_recommend")
    private String recommend;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getStreetadd() {
        return streetadd;
    }

    public void setStreetadd(String streetadd) {
        this.streetadd = streetadd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLiked() {
        return liked;
    }

    public void setLiked(String liked) {
        this.liked = liked;
    }

    public String getIntrest() {
        return intrest;
    }

    public void setIntrest(String intrest) {
        this.intrest = intrest;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    @Override
    public String toString() {
        return "The Survey of id = "+ id +
                ", Name = " + firstname +
                " " + lastname +
                ", Phone Number: " + telephone +
                ", email addres: " + email +
                ", Address: " + streetadd +
                ", " + city +
                ", " + state +
                ": " + zip +
                ", Date of Survey: " + date +
                ", How much you liked the campus: " + liked +
                ", How much you are interested: " + intrest +
                ", Will you recommend to any other students: " + recommend;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, streetadd, city, state, zip, email, telephone, intrest, liked, date, recommend);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SurveyModel surveyModel = (SurveyModel) obj;
        return Objects.equals(city, surveyModel.city) && Objects.equals(email, surveyModel.email) && Objects.equals(state, surveyModel.state) && zip == surveyModel.zip && Objects.equals(streetadd, surveyModel.streetadd) && Objects.equals(firstname, surveyModel.firstname) && Objects.equals(lastname, surveyModel.lastname) && Objects.equals(intrest, surveyModel.intrest) && Objects.equals(telephone, surveyModel.telephone) && Objects.equals(liked, surveyModel.liked) && Objects.equals(recommend, surveyModel.recommend) && Objects.equals(date, surveyModel.date);
    }
}
