package com.example.smswhteam20.repository;

import com.example.smswhteam20.domain.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member, String> {


}
