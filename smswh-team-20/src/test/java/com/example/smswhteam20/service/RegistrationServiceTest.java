package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.repository.RegistrationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@SpringBootTest
public class RegistrationServiceTest {
    @Autowired RegistrationService registrationService;


    @Test
    public void register() {
        //Given
        Registration registration = new Registration("물건", "no.1", "가전", 1);
        Registration registration1 = new Registration("임", "no.2", "가전", 1);
        //When
        registrationService.register(registration1);
        registrationService.register(registration);
        registrationService.deleteRegistration(registration1);



    }




}
