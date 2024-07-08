package com.green.quiz04;

public class Gun {
	private String model; // ÃÑ¸ðµ¨
	private int bullet; // ÃÑ¾Ë
	
	public Gun() {}
	public Gun(String model, int bullet) {
		this.model = model;
		this.bullet = bullet;
	}
	
	public void gunInfo() {
		System.out.println("±ÇÃÑ:"+model);
		System.out.println("ÇöÀçÃÑ¾Ë¼ö:"+bullet);
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
