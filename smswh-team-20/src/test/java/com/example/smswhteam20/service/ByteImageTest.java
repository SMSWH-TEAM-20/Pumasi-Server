package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.ApproveRental;
import com.example.smswhteam20.domain.CompleteRental;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.repository.ApproveRentalRepository;
import com.example.smswhteam20.repository.RegistrationRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class ByteImageTest {

    @Autowired RegistrationRepository registrationRepository;
    @Autowired RentalService rentalService;
    @Autowired
    ApproveRentalRepository approveRentalRepository;

    @Test
    void byteTest(){
        Optional<Registration> item1 = registrationRepository.findById(5);
        byte[] itemImage = item1.get().getItemImage();
        Optional<ApproveRental> approveRental = approveRentalRepository.findById(6);
        byte[] approveRentalImage = approveRental.get().getApproveRentalImage();
        CompleteRental completeRental = rentalService.returnRental(approveRental.get().getApproveRentalId(), item1.get().getItemId());
        byte[] completeRentalImage = completeRental.getCompleteRentalImage();

        Assertions.assertThat(itemImage).isEqualTo(approveRentalImage);
        Assertions.assertThat(itemImage).isEqualTo(completeRentalImage);
        Assertions.assertThat(approveRentalImage).isEqualTo(completeRentalImage);

    }
}
