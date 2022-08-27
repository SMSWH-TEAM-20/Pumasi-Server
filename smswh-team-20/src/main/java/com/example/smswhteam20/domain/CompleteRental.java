package com.example.smswhteam20.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CompleteRental")
public class CompleteRental {
    private int itemId;
    private Rental rental;

    public CompleteRental(int itemId, Rental rental) {
        this.itemId = itemId;
        this.rental = rental;
    }
}
