package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.repository.MemberRepository;
import com.example.smswhteam20.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Optional;

@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    private final RegistrationRepository registrationRepository;

    @Override
    public void join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
    }

    @Override
    public Optional<Member> findMember(String memberId) {
        return memberRepository.findById(memberId);
    }

    @Override
    public void findRegistrationItemsById(Member member) {
        Iterable<Registration> registrations = registrationRepository.findAll();
        for (Registration registration : registrations){
            if(registration.getMemberId() == member.getId()){
                member.registrationIdList.put(member.getId(), registration);
            }
        }
    }

    private void validateDuplicateMember(Member member) {
        if (memberRepository.existsById(member.getId())) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }


}
