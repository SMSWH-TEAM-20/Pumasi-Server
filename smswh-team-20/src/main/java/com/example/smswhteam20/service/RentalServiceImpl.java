package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.*;
import com.example.smswhteam20.repository.MemberRepository;
import com.example.smswhteam20.repository.RegistrationRepository;
import com.example.smswhteam20.repository.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    private final RentalRepository rentalRepository;

    @Override
    public Rental createRental(String memberId, int itemId, int rentalTime, String memo){
        return new Rental(memberId, itemId, rentalTime, memo);
    }

    @Override
    public void confirmRental(Rental rental, int itemId) {

        ApproveRental approveRental = new ApproveRental(rental, itemId);
    }

    @Override
    public void returnRental(Rental rental, int itemId) {
        CompleteRental completeRental = new CompleteRental(rental, itemId);
    }


}
