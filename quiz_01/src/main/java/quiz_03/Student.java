package quiz_03;

import java.util.ArrayList;
import java.util.Map;

public class Student {
	// Field
	private String name;
	private int age;
	private Map<String,String> homeInfo;
	private ArrayList<Integer> scoreList;
	private ExamScore exam;
	
	// Constructor
	public Student() {}

	// Method
	public void studentInfo() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		for(String key: homeInfo.keySet()) {
			String value= homeInfo.get(key);
			System.out.println("home's"+key+": "+value);
		}
		System.out.println("scoreList: "+scoreList);
		exam.examInfo(scoreList);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String, String> getHomeInfo() {
		return homeInfo;
	}
	public void setHomeInfo(Map<String, String> homeInfo) {
		this.homeInfo = homeInfo;
	}
	public ArrayList<Integer> getScoreList() {
		return scoreList;
	}
	public void setScoreList(ArrayList<Integer> scoreList) {
		this.scoreList = scoreList;
	}
	public ExamScore getExam() {
		return exam;
	}
	public void setExam(ExamScore exam) {
		this.exam = exam;
	}	
}
