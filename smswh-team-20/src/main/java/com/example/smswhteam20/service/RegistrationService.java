package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Registration;

import java.util.ArrayList;
import java.util.Optional;

public interface RegistrationService {

    // 모든 물건 조회
    ArrayList<Registration> findAllRegistration();

    // 카테고리별 물건 조회
    ArrayList<Registration> findAllRegistrationByCategory(String Category);

    // 물건 등록
    void register(Registration registration);

    // 물건 삭제
    void deleteRegistration(Registration registration);

    // 등록했던 물건 정보 수정
    void changeInformation(Registration registration, String itemName, String memo, String category, int itemPrice);
}
