package quiz_02;

public class Gugudan {
	// Field
	private int startDan;
	private int endDan;
	private int startNum;
	private int endNum;
	private Calculator calculator;
	
	// Constructor
	public Gugudan() {}
	
	// Method
	public void gugudanInfo() {
		for(int i=startDan;i<=endDan;i++) {
			for(int j=startNum;j<=endNum;j++) {
				System.out.println(i+"X"+j+"="+calculator.Calculate(i, j));
			}
		}
	}

	public int getStartDan() {
		return startDan;
	}

	public void setStartDan(int startDan) {
		this.startDan = startDan;
	}

	public int getEndDan() {
		return endDan;
	}

	public void setEndDan(int endDan) {
		this.endDan = endDan;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
}
