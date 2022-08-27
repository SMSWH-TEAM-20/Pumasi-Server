package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.Rental;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RentalServiceTest {
    @Autowired RentalService rentalService;

    @Test
    public void rentalServiceTest(){
        Rental rental = new Rental("1", 2, 3, "4");
        //대여 생성
        rentalService.createRental(rental);
        //대여 승인
        ApproveRental approveRental = rentalService.confirmRental(rental.getRentalId(), rental.getItemId());
        //대여 완료
        rentalService.returnRental(approveRental.getApproveRentalId(), approveRental.getItemId());


    }

}
