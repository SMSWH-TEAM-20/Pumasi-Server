package com.example.smswhteam20.domain;

public class Rental {

    private String memberId;
    private String itemId;
    private int rentalTime;
    private String memo;

    public Rental(String memberId, String itemId, int rentalTime, String memo) {
        this.memberId = memberId;
        this.itemId = itemId;
        this.rentalTime = rentalTime;
        this.memo = memo;
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
