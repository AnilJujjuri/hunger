package com.ltts.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ltts.entity.Member;


public interface LoginRepository extends JpaRepository<Member, String>{
	
	@Query("select m from Member m where m.email = ?1 and m.mobNo = ?2")
	public static List<Member> findUser(String userName, String mobNo) {
		// TODO Auto-generated method stub
		return null;
	}
}