package com.example.smswhteam20.domain;

import javax.persistence.*;

@Entity
@Table(name = "ApproveRental")
public class ApproveRental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int approveRentalId;
    private int itemId;
    private int rentalId;

    public ApproveRental(int itemId, int rentalId) {
        this.itemId = itemId;
        this.rentalId = rentalId;
    }
}
