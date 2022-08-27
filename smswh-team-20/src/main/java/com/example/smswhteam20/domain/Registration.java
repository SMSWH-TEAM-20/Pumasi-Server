package com.example.smswhteam20.domain;

public class Registration {
    private String itemId;
    private String memberId;
    private int itemPrice;

    public Registration(String itemId, String memberId, int itemPrice) {
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
}
