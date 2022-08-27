package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Member;

public interface MemberService {
    // Member Data Access Object

    // 회원 가입 join (중복 회원 조회 해야함)
    void join (Member member);

    // 회원 조회
    Member findMember (String MemberId);
}
