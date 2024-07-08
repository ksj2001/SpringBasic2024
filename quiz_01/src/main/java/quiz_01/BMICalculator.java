package quiz_01;

public class BMICalculator {
	// bmi = ������(kg) / Ű(m) ����
	// ��� ����
	// ��ü��(bmi : ~19)
	private double normal; // ����(bmi : 20~25) 20�� �����صд�.
	private double over; // ��ü��(bmi : 26~30) 26�� �����صд�.
	private double obesity; // ��(bmi : 31~) 31�� �����صд�.
	
	// ������
	public BMICalculator() {}
	
	// �޼���
	public void bmiInfo(double weight, double height) {
		double bmi = weight / Math.pow(height/100, 2);
		String bmiCheck;
		
		if(bmi<normal) {
			bmiCheck="��ü��";
		}else if(bmi>=normal && bmi<over) {
			bmiCheck="����ü��";
		}else if(bmi>=over && bmi<obesity) {
			bmiCheck="��ü��";
		}else {
			bmiCheck="��";
		}
		
		System.out.println("ü��������: "+bmi+"("+bmiCheck+")");
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
