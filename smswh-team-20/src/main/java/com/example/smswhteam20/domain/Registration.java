package com.example.smswhteam20.domain;

import javax.persistence.*;

@Entity
@Table(name = "Registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;
    private String memberId;
    private int itemPrice;

    private String memo;

    private String category;


    public Registration(String memo, String memberId, String category, int itemPrice) {
        this.memo = memo;
        this.memberId = memberId;
        this.category = category;
        this.itemPrice = itemPrice;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {

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
