package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.repository.MemberRepository;
import com.example.smswhteam20.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService{

    private final RegistrationRepository registrationRepository;

    @Override
    public void register(Registration registration) {
        registrationRepository.save(registration);
    }

    @Override
    public void deleteRegisteration(Registration registration) {
        registrationRepository.delete(registration);
    }

}
