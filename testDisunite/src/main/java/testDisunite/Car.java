package testDisunite;

public class Car {
	//�������
	private String model;
	private int price;
	
	//����Ʈ ������
	public Car() {}
	//�Ű����� ������
	public Car(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	//�޼���
	public void carInfo() {
		System.out.println("�ڵ��� �� : "+model);
		System.out.println("�ڵ��� ���� : "+price);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
