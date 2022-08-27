package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;


public interface MemberService {
    // Member Data Access Object

    // 모든 회원 조회
    ArrayList<Member> findAllMembers();

    // 회원 가입 join (중복 회원 조회 해야함)
    void join (Member member);

    // 회원 조회
    Optional<Member> findMember (String memberId);

    // 회원 탈퇴
    void leave(Member member);

    // 특정 회원이 등록한 물건들 조회
    void findRegistrationItems(Member member);

    // 특정 회원이 대여 중인 물건들 조회
    void findApproveRentalItems(Member member);

    // 특정 회원이 대여 완료한 물건들 조회
    void findCompleteRentalItems(Member member);
}
