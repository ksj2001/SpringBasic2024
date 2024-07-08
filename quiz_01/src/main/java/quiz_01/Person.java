package quiz_01;

import java.util.ArrayList;

public class Person {
	// ��� ����
	private String name; // �̸�
	private double weight; // ������
	private double height; // Ű
	private BMICalculator bmiCalculator; // bmi ����(ü��������)
	private ArrayList<String> hobbies; // �ּ� 3���� ���
	
	// ������
	private Person() {}
	
	// �޼���
	public void personInfo() {
		System.out.println("����: "+name);
		System.out.println("Ű: "+height);
		System.out.println("������: "+weight);
		bmiCalculatorInfo();
		System.out.print("���: "+hobbies);
	}
	public void bmiCalculatorInfo() {
		bmiCalculator.bmiInfo(weight, height);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}

	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
	
}
