package com.example.smswhteam20.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CompleteRental")
public class CompleteRental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int completeRentalId;
    private int itemId;
    private int approveRentalId;

    private String memberId;

    public CompleteRental(int itemId, int approveRentalId, String memberId) {
        this.itemId = itemId;
        this.approveRentalId = approveRentalId;
        this.memberId = memberId;
    }

    public int getCompleteRentalId() {
        return completeRentalId;
    }

    public void setCompleteRentalId(int completeRentalId) {
        this.completeRentalId = completeRentalId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getApproveRentalId() {
        return approveRentalId;
    }

    public void setApproveRentalId(int approveRentalId) {
        this.approveRentalId = approveRentalId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
