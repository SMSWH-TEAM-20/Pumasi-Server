package com.example.smswhteam20.service;

import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Registration;
import com.example.smswhteam20.repository.MemberRepository;
import com.example.smswhteam20.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService{

    private final RegistrationRepository registrationRepository;

    @Override
    public ArrayList<Registration> findAllRegistration() {
        ArrayList<Registration> registrations = new ArrayList<>();
        Streamable.of(registrationRepository.findAll()).forEach(registrations::add);
        return registrations;
    }

    @Override
    public ArrayList<Registration> findAllRegistrationByCategory(String category) {
        ArrayList<Registration> registrations = findAllRegistration(); // 전체 리스트 조회
        ArrayList<Registration> registrationArrayList = new ArrayList<>(); // 전체 리스트 중 카테고리가 같은 Registration들 저장

        for(Registration registration : registrations){
            if(registration.getCategory().equals(category)){
                registrationArrayList.add(registration);
            }
        }

        return registrationArrayList;
    }

    @Override
    public void register(Registration registration) {
        registrationRepository.save(registration);
    }

    @Override
    public void deleteRegistration(Registration registration){
        registrationRepository.delete(registration);
    }

    @Transactional
    @Override
    public void changeInformation(Registration registration, String itemName, String memo, String category, int itemPrice) {
        Optional<Registration> registration1 = registrationRepository.findById(registration.getItemId());
        registration1.get().setItemName(itemName);
        registration1.get().setMemo(memo);
        registration1.get().setCategory(category);
        registration1.get().setItemPrice(itemPrice);
    }

}
