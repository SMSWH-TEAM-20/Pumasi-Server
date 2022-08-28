package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.*;
import com.example.smswhteam20.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    private final RentalRepository rentalRepository;
    private final ApproveRentalRepository approveRentalRepository;
    private final CompleteRentalRepository completeRentalRepository;

    private final RegistrationRepository registrationRepository;

    private final MemberRepository memberRepository;


    @Override
    public void createRental(Rental rental){ rentalRepository.save(rental);}

    @Transactional
    @Override
    public ApproveRental confirmRental(int rentalId, int itemId) {  //대여 승인

        Optional<Rental> rental = rentalRepository.findById(rentalId);  // 주문 했었던 rental
        rentalRepository.deleteById(rentalId);

        String memberId = rental.get().getMemberId();
        ApproveRental approveRental = new ApproveRental(itemId, rentalId, memberId);
        approveRentalRepository.save(approveRental);

        //대여시 포인트 차감
        Optional<Member> member = memberRepository.findById(memberId);
        int point = member.get().getPoint();
        point -= 1000;
        member.get().setPoint(point);
        int point1 = member.get().getPoint();


        // approveRentalRepository의 rentalTime과 approveRentalImage를 변경
        Optional<ApproveRental> approveRental1 = approveRentalRepository.findById(approveRental.getApproveRentalId());
        approveRental1.get().setRentalTime(rental.get().getRentalTime());

        Optional<Registration> item1 = registrationRepository.findById(itemId);
        approveRental1.get().setApproveRentalImage(item1.get().getItemImage());

        return approveRental;
    }

    @Transactional
    @Override
    public CompleteRental returnRental(int approveRentalId, int itemId) { //대여 완료
        Optional<ApproveRental> approveRental = approveRentalRepository.findById(approveRentalId);
        approveRentalRepository.deleteById(approveRentalId);

        String memberId = approveRental.get().getMemberId();
        CompleteRental completeRental = new CompleteRental(itemId, approveRentalId, memberId);
        completeRentalRepository.save(completeRental);

        // completeRental의 completeRentalImage를 변경
        Optional<CompleteRental> completeRental1 = completeRentalRepository.findById(completeRental.getCompleteRentalId());
        Optional<Registration> item1 = registrationRepository.findById(itemId);
        completeRental1.get().setCompleteRentalImage(item1.get().getItemImage());

        return completeRental;
    }

    @Override
    public Optional<Rental> findRental(int rentalId){
        return rentalRepository.findById(rentalId);
    }



}
