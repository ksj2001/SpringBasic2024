package testCal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyCalculator {
	private int num1;
	private int num2;
	
	//@Qualifier("Calcul")
	@Autowired
	private Calculator cal;
	
	public MyCalculator() {}
	public MyCalculator(int num1,int num2,Calculator cal) {
		this.num1 = num1;
		this.num2 = num2;
		this.cal = cal;
	}
	
	public void add() {
		cal.addition(num1, num2);
	}
	public void sub() {
		cal.subtraction(num1, num2);
	}
	public void mul() {
		cal.multiplication(num1, num2);
	}
	public void div() {
		cal.division(num1, num2);
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public Calculator getCal() {
		return cal;
	}
	public void setCal(Calculator cal) {
		this.cal = cal;
	}
}
