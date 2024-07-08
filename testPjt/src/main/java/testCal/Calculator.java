package testCal;

import org.springframework.stereotype.Component;

//@Component("Calcul")
public class Calculator {
	public Calculator() {}
	
	public void addition(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
	}
	public void subtraction(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(num1+"-"+num2+"="+result);
	}
	public void multiplication(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(num1+"*"+num2+"="+result);
	}
	public void division(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(num1+"/"+num2+"="+result);
	}
}
