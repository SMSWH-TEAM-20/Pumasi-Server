package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public void join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
    }

    @Override
    public Member findMember(String MemberId) {
        return null;
    }

    private void validateDuplicateMember(Member member) {
        if (memberRepository.existsById(member.getId())) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }


}
