package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.repository.MemberRepository;
import com.example.smswhteam20.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService{

    private final RegistrationRepository registrationRepository;

    @Override
    public void register(Registration registration) {
        registrationRepository.save(registration);
    }

    @Override
    public void deleteRegistration(Registration registration){
        registrationRepository.delete(registration);
    }

    @Transactional
    @Override
    public void changeInformation(Registration registration, String memo, String category, int itemPrice) {
        Optional<Registration> registration1 = registrationRepository.findById(registration.getItemId());
        registration1.get().setMemo(memo);
        registration1.get().setCategory(category);
        registration1.get().setItemPrice(itemPrice);
    }

}
