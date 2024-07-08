package com.green.AnnoCTX03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoCTX03 {
	@Bean
	public Student student() {
		Student student = new Student();
		student.setName("홍길동");
		
		ArrayList<Integer> scoreArr = new ArrayList<>();
		scoreArr.add(100);
		scoreArr.add(90);
		scoreArr.add(80);
		student.setScore(scoreArr);
		
		HashSet<String> vol = new HashSet<>();
		vol.add("교육청소");
		vol.add("병원청소");
		vol.add("환경미화");
		student.setVolunteers(vol);
		
		HashMap<String,String> home = new HashMap<>();
		home.put("address", "서울시 종로구");
		home.put("phone", "010-1111-5555");
		student.setHomeInfo(home);
		
		return student;
	}
}
