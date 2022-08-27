package com.example.smswhteam20.repository;

import com.example.smswhteam20.domain.Member;
import com.example.smswhteam20.domain.Rental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends CrudRepository<Rental, String> {
    // save -> 신청

    //delete -> 삭제
}
