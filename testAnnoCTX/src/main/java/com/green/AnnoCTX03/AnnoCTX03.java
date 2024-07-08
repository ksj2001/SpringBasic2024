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
		student.setName("ȫ�浿");
		
		ArrayList<Integer> scoreArr = new ArrayList<>();
		scoreArr.add(100);
		scoreArr.add(90);
		scoreArr.add(80);
		student.setScore(scoreArr);
		
		HashSet<String> vol = new HashSet<>();
		vol.add("����û��");
		vol.add("����û��");
		vol.add("ȯ���ȭ");
		student.setVolunteers(vol);
		
		HashMap<String,String> home = new HashMap<>();
		home.put("address", "����� ���α�");
		home.put("phone", "010-1111-5555");
		student.setHomeInfo(home);
		
		return student;
	}
}
