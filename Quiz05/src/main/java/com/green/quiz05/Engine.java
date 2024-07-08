package com.green.quiz05;

public class Engine {
	private String fueltype; // 가솔린, 디젤
	private int cc; // 배기량 1991
	private int hp; // 마력 245
	private double fuelEffciency; // 연비 12.5
	
	public Engine() {}
	public Engine(String fueltype, int cc, int hp, double fuelEffciency) {
		this.fueltype = fueltype;
		this.cc = cc;
		this.hp = hp;
		this.fuelEffciency = fuelEffciency;
	}
	
	public void engineInfo() {
		System.out.println("엔진 :"+fueltype);
		System.out.println("배기량 :"+cc);
		System.out.println("마력 :"+hp);
		System.out.println("연비 :"+fuelEffciency);
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
