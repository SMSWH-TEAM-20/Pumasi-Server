package com.example.smswhteam20.controller;

import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    // 카테고리별 등록한 물건들 리스트 조회
    @GetMapping("/registration/category")
    public ArrayList<Registration> findRegistrationArrayList(
            @RequestParam(value = "category", required = false, defaultValue = "") String category){
        ArrayList<Registration> registrations = registrationService.findAllRegistration(); // 전체 리스트 조회
        ArrayList<Registration> registrationArrayList = new ArrayList<>(); // 전체 리스트 중 카테고리가 같은 Registration들 저장

        for(Registration registration : registrations){
            if(registration.getCategory().equals(category)){
                registrationArrayList.add(registration);
            }
        }

        return registrationArrayList;
    }

    // 등록한 물건 정보 수정
    @PostMapping("/change/registration")
    public void changeItemInformation(@RequestBody Registration registration,
                                      @RequestParam(value = "itemPrice", required = false, defaultValue = "") int itemPrice,
                                      @RequestParam(value = "memo", required = false, defaultValue = "")String memo,
                                      @RequestParam(value = "category", required = false, defaultValue = "")String category){

        registrationService.changeInformation(registration, itemPrice, memo, category);

    }
}
