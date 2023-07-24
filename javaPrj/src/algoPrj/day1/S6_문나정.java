package algoPrj.day1;

public class S6_문나정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//코드 작성
		final int MAX = 10;
		float sum = 0; //항의 누적합
		int multi = 1; //분모
		int i = 1; //반복제어변수 + 분자
		int a = -1; //부호 변수
		
		sum  += multi;
		while(i<=MAX) {
			i = i+1;
			multi = i * multi;
			sum = (a*(i/multi)) + sum;
			a = -a;
		}
		System.out.println(sum);
	}
	
	//정수 + 정수 -> 정수
	//정수 + 실수 -> 실수
}
