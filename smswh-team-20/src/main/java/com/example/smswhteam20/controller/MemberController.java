package com.example.smswhteam20.controller;

import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    // 회원 가입
    @PostMapping("/member/join")
    public Member save(@RequestBody Member member){
        return memberRepository.save(member);
    }
}
