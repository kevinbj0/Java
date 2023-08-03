package day11_클래스만들고사용;

//데이타  + 데이타를 기능을 하나의 단위로 묶는다.
//데이타 보호  (접근제어자:private , public  , 생성자)

public class Mile3 {

	//멤버변수
	private int mile;
	private double kiloMeter;

	
	//멤버변수를 다루는 기능(함수) , 매서드라고 부름
	//비공개
	private  double calCulator(int mile ) {
		this.mile = mile;
		this.kiloMeter = mile*1.60934;
		return kiloMeter;		
	}	
	
	//공개
	public double getkiloMeter(int mile) {		
		double  result = calCulator(mile);
		return result;
	}
 
	
}
