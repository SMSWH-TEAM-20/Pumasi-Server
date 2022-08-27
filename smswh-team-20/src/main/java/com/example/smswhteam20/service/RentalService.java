package com.example.smswhteam20.service;


import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Rental;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface RentalService {

    void createRental(Rental rental); //대여 주문 생성

    void confirmRental(int rentalId, int itemId); //대여 주문 승인

    void returnRental(int approveRentalId, int itemId); //대여 주문 승인 후 반납

}
