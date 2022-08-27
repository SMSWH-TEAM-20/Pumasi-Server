package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Registration;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface RegistrationService {


    // 물건 등록
    void register(Registration registration);


    // 물건 삭제
    void deleteRegistration(Registration registration);

    // 등록했던 물건 정보 수정
    void changeInformation(Registration registration, String memo, String category, int itemPrice);
}
