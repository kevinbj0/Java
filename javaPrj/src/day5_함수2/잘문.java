package day5_함수2;

public class 잘문 {

	public static void main(String[] args) {
		//지역변수 : 함수안에서 만든 변수는 그 함수안에서 유효하다.
		//변수의 유효범위
		//main에서 만든 변수는 main에서만 유효하다
		String[] days = new String[3];
		int i = 0;
		insetyDay(days, i);
		System.out.println(days[i]);
		
	}

	public static void insetyDay(String[] days, int i) {
		days[i]="놀러가기";
	}

}
