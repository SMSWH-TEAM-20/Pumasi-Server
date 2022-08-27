package com.example.smswhteam20.domain;

import javax.persistence.Entity;

@Entity
public class Rental {

    private String memberId;
    private int itemId;
    private int rentalTime;
    private String memo;

    public Rental(String memberId, int itemId, int rentalTime, String memo) {
        this.memberId = memberId;
        this.itemId = itemId;
        this.rentalTime = rentalTime;
        this.memo = memo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getRentalTime() {
        return rentalTime;
    }

    public void setRentalTime(int rentalTime) {
        this.rentalTime = rentalTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
