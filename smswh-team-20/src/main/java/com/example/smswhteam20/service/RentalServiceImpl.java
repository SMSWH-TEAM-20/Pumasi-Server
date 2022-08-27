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
    public void createRental(Rental rental){ rentalRepository.save(rental);}

    @Override
    public ApproveRental confirmRental(int rentalId, int itemId) {  //대여 승인
        Optional<Rental> rental = rentalRepository.findById(rentalId);  // 주문 했었던 rental
        rentalRepository.deleteById(rentalId);
        String memberId = rental.get().getMemberId();
        ApproveRental approveRental = new ApproveRental(itemId, rentalId, memberId);
        approveRentalRepository.save(approveRental);

        return approveRental;
    }

    @Override
    public CompleteRental returnRental(int approveRentalId, int itemId) { //대여 완료
        Optional<ApproveRental> approveRental = approveRentalRepository.findById(approveRentalId);
        approveRentalRepository.deleteById(approveRentalId);
        String memberId = approveRental.get().getMemberId();
        CompleteRental completeRental = new CompleteRental(itemId, approveRentalId, memberId);
        completeRentalRepository.save(completeRental);
        return completeRental;
    }

}
