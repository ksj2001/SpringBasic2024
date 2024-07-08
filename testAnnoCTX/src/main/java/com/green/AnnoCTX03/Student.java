package com.green.AnnoCTX03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Student {
	private String name;
	private ArrayList<Integer> score;
	private HashSet<String> volunteers;
	private HashMap<String, String> homeInfo; // address, phone
	
	public Student() {}
	public Student(String name, ArrayList<Integer> score,
			HashSet<String> volunteers, HashMap<String, String> homeInfo) {
		this.name = name;
		this.score = score;
		this.volunteers = volunteers;
		this.homeInfo = homeInfo;
	}
	
	public void studentInfo() {
		System.out.println("학생이름: "+name);
		System.out.println("학생점수: "+score);
		
		// HashSet을 순서대로 정렬하려면 List 객체에 담아준다.
		List<String> volun = new ArrayList<String>(volunteers);
//		Collections.sort(volun);
		Collections.reverse(volun);
		System.out.println("봉사활동: "+volun);
		
		List<String> keySet = new ArrayList<String>(homeInfo.keySet());
		Collections.reverse(keySet);
	
		for(String key: keySet) {
			String value = homeInfo.get(key);
			System.out.println(key+":"+value);
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Integer> getScore() {
		return score;
	}
	public void setScore(ArrayList<Integer> score) {
		this.score = score;
	}
	public HashSet<String> getVolunteers() {
		return volunteers;
	}
	public void setVolunteers(HashSet<String> volunteers) {
		this.volunteers = volunteers;
	}
	public HashMap<String, String> getHomeInfo() {
		return homeInfo;
	}
	public void setHomeInfo(HashMap<String, String> homeInfo) {
		this.homeInfo = homeInfo;
	}
}
