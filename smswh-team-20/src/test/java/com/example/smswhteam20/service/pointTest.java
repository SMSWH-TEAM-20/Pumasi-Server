package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.domain.Rental;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class pointTest {
    @Autowired MemberService memberService;
    @Autowired RegistrationService registrationService;

    @Autowired RentalService rentalService;

    @Test
    void pointServiceTest(){
        Member member = new Member("no.1", "memberA", "image".getBytes(), "1234", "email", "010");
        memberService.join(member);
        Registration registration = new Registration("물건","image".getBytes(), "입니다", "no.1", "가전", 1L);
        registrationService.register(registration);
        Rental rental = new Rental("no.1", 1, 3, "4");
        rentalService.createRental(rental);
        //rental 객체 조회
        rentalService.findRental(rental.getRentalId());
        //대여 승인
        rentalService.confirmRental(rental.getRentalId(), rental.getItemId());

    }
}
