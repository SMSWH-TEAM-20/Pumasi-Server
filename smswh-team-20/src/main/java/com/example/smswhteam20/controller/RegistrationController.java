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

    // 모든 물건들 조회
    @GetMapping("/registration/findAll")
    public ArrayList<Registration> findAllRegistration(){
        return registrationService.findAllRegistration();
    }

    // 카테고리별 등록한 물건들 리스트 조회
    @GetMapping("/registration/category")
    public ArrayList<Registration> findRegistrationsByCategory(
            @RequestParam(value = "category", required = false, defaultValue = "") String category){

        return registrationService.findAllRegistrationByCategory(category);
    }

    // 등록한 물건 정보 수정
    @PostMapping("/change/registration")
    public void changeItemInformation(@RequestBody Registration registration,
                                      @RequestParam(value = "itemName", required = false, defaultValue = "")String itemName,
                                      @RequestParam(value = "memo", required = false, defaultValue = "")String memo,
                                      @RequestParam(value = "category", required = false, defaultValue = "")String category,
                                      @RequestParam(value = "itemPrice", required = false, defaultValue = "") int itemPrice){


        registrationService.changeInformation(registration, itemName, memo, category, itemPrice);

    }

    // -- 물건 정보 조회 하는 부분 -- (사실 객체만 있으면 .getName 이런식으로 하면 되긴 함)


    // 물건 이름 조회
    @GetMapping("/registration/information/name")
    public String getRegistrationName(@RequestBody Registration registration){
        return registration.getItemName();
    }

    // 물건 메모 조회
    @GetMapping("/registration/information/memo")
    public String getRegistrationMemo(@RequestBody Registration registration){
        return registration.getMemo();
    }

    // 물건 가격 조회
    @GetMapping("/registration/information/price")
    public Integer getRegistrationPrice(@RequestBody Registration registration){
        return registration.getItemPrice();
    }

}
