package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

public interface RegistrationService {

    // 물건 아이디로 물건 조회
    Optional<Registration> findItemById(int itemId);

    // 모든 물건 조회
    ArrayList<Registration> findAllRegistration();

    // 카테고리별 물건 조회
    ArrayList<Registration> findAllRegistrationByCategory(String Category);

    // 물건 등록
    void register(Registration registration);

    // 물건 삭제
    void deleteRegistration(Registration registration);

    // 등록했던 물건 정보 수정
    void changeInformation(Registration registration, String itemName, String itemImage, String memo, String category, Long itemPrice);
}
