package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.domain.Rental;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;

@SpringBootTest
public class MemberServiceTest {
    @Autowired MemberService memberService;
    @Autowired RegistrationService registrationService;

    @Autowired RentalService rentalService;


    @Test
    void memberServiceTest() {
        Member member = new Member("no.7", "memberA", "1234", "email", "010");
        //회원 가입
        memberService.join(member);

        //모든 회원 조회
        memberService.findAllMembers();
        //특정 회원이 등록 중인 물건들 조회

        memberService.findRegistrationItems(member);
        // 특정 회원이 대여 중인 물건들 조회
        memberService.findApproveRentalItems(member);
        //특정 회원이 대여 완료한 물건들 조회
        memberService.findCompleteRentalItems(member);
        //회원 탈퇴
        memberService.leave(member);

    }

    @Test
    public void findAll(){
        //전체회원 조회
        Member member1 = new Member("no.1", "memberA", "1", "email1", "112");
        memberService.join(member1);
        Member member2 = new Member("no.2", "memberB", "2", "email2", "119");
        memberService.join(member2);
        ArrayList<Member> members = memberService.findAllMembers();
        Assertions.assertThat(members.size()).isEqualTo(2);
        for(int i = 0; i<members.size(); i++){
            System.out.println(members.get(i).getId());
        }
    }

    @Test
    public void findRegistrationItems(){
        //특정 회원의 등록 물품 조회
        Member member1 = new Member("no.1", "memberA", "1", "email1", "112");
        memberService.join(member1);
        Member member2 = new Member("no.2", "memberB", "2", "email2", "119");
        memberService.join(member2);

        Registration registration1 = new Registration("물건","입니다", "no.1", "가전", 1L);
        registrationService.register(registration1);
        memberService.findRegistrationItems(member1);

        Registration registration2 = new Registration("사과","이다", "no.2", "음식", 2L);
        registrationService.register(registration2);
        memberService.findRegistrationItems(member2);

        System.out.println(member1.getRegistrationArrayList().get(0).getCategory());
        System.out.println(member2.getRegistrationArrayList().get(0).getCategory());


    }

    @Test
    public void findApproveRentalItems(){
        //특정 회원의 대여 중인 물품 조회
        Member member1 = new Member("no.1", "memberA", "1", "email1", "112");
        memberService.join(member1);
        Member member2 = new Member("no.2", "memberB", "2", "email2", "119");
        memberService.join(member2);

        Rental rental1 = new Rental("no.1", 1, 2, "3");
        rentalService.createRental(rental1);
        rentalService.confirmRental(rental1.getRentalId(), rental1.getItemId());
        memberService.findApproveRentalItems(member1);
        System.out.println(member1.getApproveRentalArrayList().get(0).getMemberId());

        Rental rental2 = new Rental("no.2", 2, 3, "4");
        rentalService.createRental(rental2);
        rentalService.confirmRental(rental2.getRentalId(), rental2.getItemId());
        memberService.findApproveRentalItems(member2);
        System.out.println(member2.getApproveRentalArrayList().get(0).getMemberId());

    }
    @Test
    public void findCompleteRentalItems(){
        //특정 회원의 대여 완료된 물품 조회
        Member member1 = new Member("no.1", "memberA", "1", "email1", "112");
        memberService.join(member1);
        Member member2 = new Member("no.2", "memberB", "2", "email2", "119");
        memberService.join(member2);
        Rental rental1 = new Rental("no.1", 1, 2, "3");
        rentalService.createRental(rental1);
        ApproveRental approveRental1 = rentalService.confirmRental(rental1.getRentalId(), rental1.getItemId());
        rentalService.returnRental(approveRental1.getApproveRentalId(), approveRental1.getItemId());
        memberService.findCompleteRentalItems(member1);
        System.out.println(member1.getCompleteRentalArrayList().get(0).getMemberId());



    }



}
