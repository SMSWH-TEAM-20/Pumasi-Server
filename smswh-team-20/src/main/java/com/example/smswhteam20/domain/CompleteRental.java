package com.example.smswhteam20.domain;

import javax.persistence.*;

@Entity
@Table(name = "CompleteRental")
public class CompleteRental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int completeRentalId;
    private int itemId;
    private int approveRentalId;

    public CompleteRental(int itemId, int approveRentalId) {
        this.itemId = itemId;
        this.approveRentalId = approveRentalId;
    }
}
