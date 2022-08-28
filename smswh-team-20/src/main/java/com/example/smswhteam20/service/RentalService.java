package com.example.smswhteam20.service;


import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.CompleteRental;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.domain.Rental;

import java.util.Optional;

public interface RentalService {

    void createRental(Rental rental); //대여 주문 생성

    ApproveRental confirmRental(int rentalId, int itemId); //대여 주문 승인

    CompleteRental returnRental(int approveRentalId, int itemId); //대여 주문 승인 후 반납


    // rentalId로 rental 객체 조회하기
    Optional<Rental> findRental(int rentalId);

    // rentalId로 대여한 물건 객체 조회하기
//    Optional<Registration> findConfirmRental(int rentalId);


}
