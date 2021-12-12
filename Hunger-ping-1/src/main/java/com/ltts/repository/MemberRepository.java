package com.ltts.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltts.entity.Member;

public interface MemberRepository extends CrudRepository<Member, String>{

}
