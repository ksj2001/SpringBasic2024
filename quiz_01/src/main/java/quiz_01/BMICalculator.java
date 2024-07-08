package quiz_01;

public class BMICalculator {
	// bmi = 몸무게(kg) / 키(m) 제곱
	// 멤버 변수
	// 저체중(bmi : ~19)
	private double normal; // 정상(bmi : 20~25) 20을 저장해둔다.
	private double over; // 과체중(bmi : 26~30) 26을 저장해둔다.
	private double obesity; // 비만(bmi : 31~) 31을 저장해둔다.
	
	// 생성자
	public BMICalculator() {}
	
	// 메서드
	public void bmiInfo(double weight, double height) {
		double bmi = weight / Math.pow(height/100, 2);
		String bmiCheck;
		
		if(bmi<normal) {
			bmiCheck="저체중";
		}else if(bmi>=normal && bmi<over) {
			bmiCheck="정상체중";
		}else if(bmi>=over && bmi<obesity) {
			bmiCheck="과체중";
		}else {
			bmiCheck="비만";
		}
		
		System.out.println("체질량지수: "+bmi+"("+bmiCheck+")");
	}

	public double getNormal() {
		return normal;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public double getOver() {
		return over;
	}

	public void setOver(double over) {
		this.over = over;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	
}
