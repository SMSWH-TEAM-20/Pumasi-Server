package com.example.smswhteam20.domain;

import javax.persistence.Entity;

@Entity
public class Registration {
    private String itemId;
    private String memberId;
    private int itemPrice;

    private String memo;


    public Registration(String memo, String itemId, String memberId, int itemPrice) {
        this.memo = memo;
        this.itemId = itemId;
        this.memberId = memberId;
        this.itemPrice = itemPrice;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
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
