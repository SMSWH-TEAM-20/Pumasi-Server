package com.example.smswhteam20.service;


import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Rental;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface RentalService {

    Rental createRental(String memberId, int itemId, int rentalTime, String memo); //대여 주문 생성

}
