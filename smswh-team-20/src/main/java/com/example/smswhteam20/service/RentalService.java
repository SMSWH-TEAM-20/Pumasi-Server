package com.example.smswhteam20.service;


import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.CompleteRental;
import com.example.smswhteam20.domain.Rental;

public interface RentalService {

    void createRental(Rental rental); //대여 주문 생성

    ApproveRental confirmRental(int rentalId, int itemId); //대여 주문 승인

    CompleteRental returnRental(int approveRentalId, int itemId); //대여 주문 승인 후 반납


    // 대여 주문한 id로 지금 대여중인 객체(ApproveRental) 찾기


}
