package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.*;
import com.example.smswhteam20.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    private final RentalRepository rentalRepository;
    private final ApproveRentalRepository approveRentalRepository;
    private final CompleteRentalRepository completeRentalRepository;

    @Override
    public Rental createRental(String memberId, int itemId, int rentalTime, String memo){
        Rental rental = new Rental(memberId, itemId, rentalTime, memo);
        rentalRepository.save(rental);
        return rental;
    }

    @Override
    public void confirmRental(int rentalId, int itemId) {
        Optional<Rental> rental = rentalRepository.findById(rentalId);  // 주문 했었던 rental
        rentalRepository.deleteById(rentalId);
        ApproveRental approveRental = new ApproveRental(itemId, rentalId);
        approveRentalRepository.save(approveRental);
    }

    @Override
    public void returnRental(int approveRentalId, int itemId) {
        Optional<ApproveRental> approveRental = approveRentalRepository.findById(approveRentalId);
        approveRentalRepository.deleteById(approveRentalId);
        CompleteRental completeRental = new CompleteRental(itemId, approveRentalId);
        completeRentalRepository.save(completeRental);
    }


}
