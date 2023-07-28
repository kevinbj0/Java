package day5_함수2;

public class 매개변수 {

	public static void main(String[] args) {
		//i~부터 입력받은 수까지 합
		int n= 5;
		getSum2(n);
	}

	public static void getSum2(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum+i;
		}
	}

}
