package com.example.smswhteam20.service;

import com.example.smswhteam20.AutoAppConfig;
import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.domain.Rental;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class MemberServiceTest {
    @Autowired MemberService memberService;
    @Autowired RegistrationService registrationService;

    @Autowired RentalService rentalService;


    @Test
    void serviceTest() {
        //give
        Member member = new Member("no.7", "memberA", "1234", "email", "010");
        //when
        memberService.join(member);
        Registration registration = new Registration("물건","입니다", "no.7", "가전", 1L);
        registrationService.register(registration);
        memberService.findRegistrationItems(member);
        Rental rental = new Rental("No.7", 1, 3, "4");
        rentalService.createRental(rental);
        ApproveRental approveRental = rentalService.confirmRental(rental.getRentalId(), rental.getItemId());
        rentalService.returnRental(approveRental.getApproveRentalId(), approveRental.getItemId());
        memberService.findApproveRentalItems(member);
        memberService.findCompleteRentalItems(member);

    }


}
