package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.CompleteRental;
import com.example.smswhteam20.domain.Rental;
import org.assertj.core.api.Assertions;
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
        //rental 객체 조회
        rentalService.findRental(rental.getRentalId());
        //대여 승인
        ApproveRental approveRental = rentalService.confirmRental(rental.getRentalId(), rental.getItemId());
        // 대여한 물건 객체 조회
        byte[] approveRentalImage = approveRental.getApproveRentalImage();
        //대여 완료
        CompleteRental completeRental = rentalService.returnRental(approveRental.getApproveRentalId(), approveRental.getItemId());
        //
        byte[] completeRentalImage = completeRental.getCompleteRentalImage();

        Assertions.assertThat(approveRentalImage).isEqualTo(completeRentalImage);


    }


}
