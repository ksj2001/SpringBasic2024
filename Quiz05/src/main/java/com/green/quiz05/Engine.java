package com.green.quiz05;

public class Engine {
	private String fueltype; // ���ָ�, ����
	private int cc; // ��ⷮ 1991
	private int hp; // ���� 245
	private double fuelEffciency; // ���� 12.5
	
	public Engine() {}
	public Engine(String fueltype, int cc, int hp, double fuelEffciency) {
		this.fueltype = fueltype;
		this.cc = cc;
		this.hp = hp;
		this.fuelEffciency = fuelEffciency;
	}
	
	public void engineInfo() {
		System.out.println("���� :"+fueltype);
		System.out.println("��ⷮ :"+cc);
		System.out.println("���� :"+hp);
		System.out.println("���� :"+fuelEffciency);
	}
	
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public double getFuelEffciency() {
		return fuelEffciency;
	}
	public void setFuelEffciency(double fuelEffciency) {
		this.fuelEffciency = fuelEffciency;
	}
}
