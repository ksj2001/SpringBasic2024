package com.green.quiz04;

public class Gun {
	private String model; // �Ѹ�
	private int bullet; // �Ѿ�
	
	public Gun() {}
	public Gun(String model, int bullet) {
		this.model = model;
		this.bullet = bullet;
	}
	
	public void gunInfo() {
		System.out.println("����:"+model);
		System.out.println("�����Ѿ˼�:"+bullet);
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
}
