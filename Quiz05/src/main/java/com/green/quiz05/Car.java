package com.green.quiz05;

public class Car {
	private String model;
	private Engine engine;
	
	public Car() {}
	public Car(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
	}
	
	public void carInfo() {
		System.out.println("¸ðµ¨ :"+model);
		engine.engineInfo();
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
