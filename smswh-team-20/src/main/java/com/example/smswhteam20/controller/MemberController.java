package com.example.smswhteam20.controller;

import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.CompleteRental;
import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.repository.MemberRepository;
import com.example.smswhteam20.repository.RegistrationRepository;
import com.example.smswhteam20.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    // 회원 가입
    @PostMapping("/member/join")
    public Member save(@RequestBody Member member){
        memberService.join(member);
        return member;
    }

    // 회원 로그인
    @GetMapping("/member/login")
    public Member login(@RequestParam(value = "id", required = false, defaultValue = "") String memberId,
                        @RequestParam(value = "password", required = false, defaultValue = "")String password){
        Optional<Member> member = memberService.findMember(memberId);

        if (member.isPresent()){
            // 존재 하는 id.
            if((member.get().getPassword()).equals(password)){
                System.out.println("successful");
                return member.get();
            }
            else{
                System.out.println("password does not match");
                throw new IllegalStateException("password does not match");
            }
        }
        else {
            // 존재하지 않는 id.
            System.out.println("not exist");
            throw new IllegalStateException("not exist");
        }

    }

    // 회원 탈퇴
    @PostMapping("/member/leave")
    public void leave(@RequestBody Member member){
        memberService.leave(member);
    }

    // 회원 정보 수정
    @PostMapping("member/change")
    public void changeInformation(@RequestBody Member member,
                                  @RequestParam(value = "id", required = false, defaultValue = "")String id,
                                  @RequestParam(value = "password", required = false, defaultValue = "")String password,
                                  @RequestParam(value = "name", required = false, defaultValue = "")String name,
                                  @RequestParam(value = "email", required = false, defaultValue = "")String email,
                                  @RequestParam(value = "telNum", required = false, defaultValue = "")String telNum){
        memberService.changeMemberInformation(member, id, password, name, email, telNum);
    }

    // --- 마이페이지 부분 ---

    // 회원 이름 조회하기
    @GetMapping("/myPage/getName")
    public String getName(@RequestBody Member member){
        System.out.println(member.getName());
        return member.getName();
    }

    // 회원 포인트 조회하기
    @GetMapping("/myPage/getPoint")
    public int getPoint(@RequestBody Member member) {
        System.out.println(member.getPoint());
        return member.getPoint();
    }

    // 여기서부터 메서드랑 전부 다시 확인 필요

    // 회원 등록 상품 목록 조회
    @GetMapping("/myPage/getRegistrationList")
    public ArrayList<Registration> getRegistrationList (@RequestBody Member member){ // 등록한 물품 리스트
        memberService.findRegistrationItems(member);
        return member.getRegistrationArrayList();
    }

    // 회원 대여 중인 상품 목록 조회
    @GetMapping("/myPage/getApproveRentalList")
    public ArrayList<ApproveRental> getApproveRentalList (@RequestBody Member member){
        memberService.findApproveRentalItems(member);
        return member.getApproveRentalArrayList();
    }


    // 회원 대여 완료 상품 목록 조회
    @GetMapping("/myPage/getCompleteRentalList")
    public ArrayList<CompleteRental> getCompleteRentalList (@RequestBody Member member){
        memberService.findCompleteRentalItems(member);
        return member.getCompleteRentalArrayList();
    }






}
