package com.example.smswhteam20.repository;

import com.example.smswhteam20.domain.CompleteRental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompleteRentalRepository extends CrudRepository<CompleteRental, Integer> {
    // 추가

    // 삭제
}
