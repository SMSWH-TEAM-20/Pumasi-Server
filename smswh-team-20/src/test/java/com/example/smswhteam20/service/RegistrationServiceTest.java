package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Registration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;

@SpringBootTest
public class RegistrationServiceTest {
    @Autowired RegistrationService registrationService;


    @Test
    public void registrationServiceTest() {
        Registration registration = new Registration("물건","입니다", "no.1", "가전", 1);
        Registration registration1 = new Registration("냉장고","입니다", "no.2", "가전", 2);
        //등록

        registrationService.register(registration);
        registrationService.register(registration1);
        //등록 삭제
        registrationService.deleteRegistration(registration1);

        //등록 정보 변경
        registrationService.changeInformation(registration, "가방","입니다", "잡화", 100 );
        //모든 등록 조회

        registrationService.findAllRegistration();
        //카테고리별 등록된 물건들 조회
        registrationService.findAllRegistrationByCategory("가전");

    }
    @Test
    public void findAllRegistration(){

        Registration registration = new Registration("물건","입니다", "no.1", "가전", 1);
        Registration registration1 = new Registration("냉장고","입니다", "no.2", "가전", 2);
        //등록
        registrationService.register(registration);
        registrationService.register(registration1);
        ArrayList<Registration> registrations = registrationService.findAllRegistration();
        ArrayList<Registration> RegistrationsByCategory = registrationService.findAllRegistrationByCategory("가전");
        for(int i = 0; i<registrations.size(); i++){
            System.out.println(registrations.get(i).getItemName());
            System.out.println(RegistrationsByCategory.get(i).getMemo());
        }
    }
}