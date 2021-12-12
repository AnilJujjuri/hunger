package com.ltts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ltts.entity.Member;
import com.ltts.entity.Restaurant;
import com.ltts.repository.MemberRepository;
import com.ltts.repository.RestaurantRepository;

@SpringBootApplication
public class HungerPing1Application {

	static ConfigurableApplicationContext cont = null;
	
	public static void main(String[] args) {
		HungerPing1Application.cont = SpringApplication.run(HungerPing1Application.class, args);
			
	}
	public static void insertMemberToDatabase(Member member) {
		MemberRepository mr = cont.getBean(MemberRepository.class);
		
		mr.save(member);
	}
	public static void insertMemberToDatabase(Restaurant restaurant) {
		RestaurantRepository ms = cont.getBean(RestaurantRepository.class);
		
		ms.save(restaurant);
	}

}
