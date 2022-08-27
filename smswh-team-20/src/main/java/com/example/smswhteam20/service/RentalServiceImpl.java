package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.domain.Rental;
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


}
