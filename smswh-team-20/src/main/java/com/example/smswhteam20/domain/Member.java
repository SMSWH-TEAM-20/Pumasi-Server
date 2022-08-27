package com.example.smswhteam20.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashMap;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Member")
public class Member  {
    @Id
    private String id;
    private String name;
    private String password;
    private String email;
    private String telNum;

    private int point;

    public ArrayList<Registration> registrationArrayList;
    public ArrayList<ApproveRental> approveRentalArrayList;
    public ArrayList<CompleteRental> completeRentalArrayList;

    public Member(String id, String name, String password, String email, String telNum) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.telNum = telNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }


    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public ArrayList<Registration> getRegistrationArrayList() {
        return registrationArrayList;
    }

    public void setRegistrationArrayList(ArrayList<Registration> registrationArrayList) {
        this.registrationArrayList = registrationArrayList;
    }

    public ArrayList<ApproveRental> getApproveRentalArrayList() {
        return approveRentalArrayList;
    }

    public void setApproveRentalArrayList(ArrayList<ApproveRental> approveRentalArrayList) {
        this.approveRentalArrayList = approveRentalArrayList;
    }

    public ArrayList<CompleteRental> getCompleteRentalArrayList() {
        return completeRentalArrayList;
    }

    public void setCompleteRentalArrayList(ArrayList<CompleteRental> completeRentalArrayList) {
        this.completeRentalArrayList = completeRentalArrayList;
    }
}
