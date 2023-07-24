package algoPrj.day1;

public class S5_지원님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // 항의 누적항

		int n = 0; // 항의 누적을 구할 변수
		int a = 2; // 반복제어변수
		int b = 3; // 항을 구할 변수

		while (n < 7) {
			sum = sum + a;
			a = a * b;
			n++;
		}
	}
}
