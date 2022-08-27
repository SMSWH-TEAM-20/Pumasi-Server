package com.example.smswhteam20.domain;

import javax.persistence.Entity;

@Entity
public class Registration {
    private int itemId;
    private String memberId;
    private int itemPrice;

    private String memo;


    public Registration(String memo, int itemId, String memberId, int itemPrice) {
        this.memo = memo;
        this.itemId = itemId;
        this.memberId = memberId;
        this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getMemo() { return memo;
    }

    public void setMemo(String memo) { this.memo = memo;
    }

}
