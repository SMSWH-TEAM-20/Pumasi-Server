package com.example.smswhteam20.service;

import com.example.smswhteam20.AutoAppConfig;
import com.example.smswhteam20.domain.Member;
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


    @Test
    void join() {
        //give
        Member member = new Member("no.7", "memberA", "1234", "email", "010");
        //when
        memberService.join(member);
        //then


    }
}
