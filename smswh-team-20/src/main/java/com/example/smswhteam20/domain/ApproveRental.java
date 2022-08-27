package com.example.smswhteam20.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ApproveRental")
public class ApproveRental {
    private int itemId;
    private Rental rental;

    public ApproveRental(int itemId, Rental rental) {
        this.itemId = itemId;
        this.rental = rental;
    }
}
