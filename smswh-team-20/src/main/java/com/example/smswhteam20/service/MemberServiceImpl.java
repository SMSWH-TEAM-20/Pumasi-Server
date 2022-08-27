package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.CompleteRental;
import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.repository.ApproveRentalRepository;
import com.example.smswhteam20.repository.CompleteRentalRepository;
import com.example.smswhteam20.repository.MemberRepository;
import com.example.smswhteam20.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    private final RegistrationRepository registrationRepository;
    private final ApproveRentalRepository approveRentalRepository;
    private final CompleteRentalRepository completeRentalRepository;

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
    public void leave(Member member) {
        memberRepository.delete(member);
    }

    @Override
    public void changeMemberInformation(Member member, String id, String password, String name, String email, String telNum) {
        member.setId(id);
        member.setPassword(password);
        member.setName(name);
        member.setEmail(email);
        member.setTelNum(telNum);
    }

    @Override
    public void findRegistrationItems(Member member) {
        member.getRegistrationArrayList().clear();
        Iterable<Registration> registrations = registrationRepository.findAll();
        for (Registration registration : registrations){
            if(registration.getMemberId() == member.getId()){
                member.registrationArrayList.add(registration);
            }
        }
    }

    @Override
    public void findApproveRentalItems(Member member) {
        member.getApproveRentalArrayList().clear();
        Iterable<ApproveRental> approveRentals = approveRentalRepository.findAll();
        for (ApproveRental approveRental : approveRentals){
            if(approveRental.getMemberId() == member.getId()){
                member.approveRentalArrayList.add(approveRental);
            }
        }
    }

    @Override
    public void findCompleteRentalItems(Member member) {
        member.getCompleteRentalArrayList().clear();
        Iterable<CompleteRental> completeRentals = completeRentalRepository.findAll();
        for (CompleteRental completeRental : completeRentals){
            if(completeRental.getMemberId() == member.getId()){
                member.completeRentalArrayList.add(completeRental);
            }
        }
    }

    private void validateDuplicateMember(Member member) {
        if (memberRepository.existsById(member.getId())) {
            System.out.println("duplicate member error");
            throw new IllegalStateException("duplicate member error");
        }
    }


}
