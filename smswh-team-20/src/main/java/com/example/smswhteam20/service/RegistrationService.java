package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Registration;

import java.util.Optional;

public interface RegistrationService {


    // 물건 등록
    void register(Registration registration);


    // 물건 삭제
    void deleteRegistration(Registration registration);

}
