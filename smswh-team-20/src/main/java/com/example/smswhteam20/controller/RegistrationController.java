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

    // 물건 등록하기 - 정보 모두 전달 ver. :: 확인 완료
    @PostMapping("/registration/create-all")
    public Registration createAllRegistration(@RequestParam(required = false, defaultValue = "") String itemName,
                                           @RequestParam(required = false, defaultValue = "")String memo,
                                           @RequestParam(required = false, defaultValue = "")String memberId,
                                           @RequestParam(required = false, defaultValue = "")String category,
                                           @RequestParam(required = false, defaultValue = "")Long itemPrice){
        Registration registration = new Registration(itemName, memo, memberId, category, itemPrice);
        registrationService.register(registration);
        return registration;
    }

    // 물건 등록하기 - 객체를 넘기면 DB에 저장 ver. :: 확인 완료
    @PostMapping("/registration/create")
    public Registration createRegistration(@RequestBody Registration registration){
        registrationService.register(registration);
        return registration;
    }

    // 물건 삭제 :: 확인 완료
    @PostMapping("/registration/delete")
    public void deleteRegistration(@RequestBody Registration registration){
        registrationService.deleteRegistration(registration);
    }

    // 모든 물건들 조회 :: 확인 완료
    @GetMapping("/registration/findAll")
    public ArrayList<Registration> findAllRegistration(){
        return registrationService.findAllRegistration();
    }

    // 카테고리별 등록한 물건들 리스트 조회 :: 확인 완료
    @GetMapping("/registration/category")
    public ArrayList<Registration> findRegistrationsByCategory(
            @RequestParam(value = "category", required = false, defaultValue = "") String category){

        return registrationService.findAllRegistrationByCategory(category);
    }

    // 등록한 물건 정보 수정 :: 확인 완료
    @PostMapping("/change/registration")
    public void changeItemInformation(@RequestBody Registration registration,
                                      @RequestParam(required = false, defaultValue = "")String itemName,
                                      @RequestParam(required = false, defaultValue = "")String memo,
                                      @RequestParam(required = false, defaultValue = "")String category,
                                      @RequestParam(required = false, defaultValue = "") Long itemPrice){


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
    public Long getRegistrationPrice(@RequestBody Registration registration){
        return registration.getItemPrice();
    }

}
