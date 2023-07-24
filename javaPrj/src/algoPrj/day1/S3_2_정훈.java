package algoPrj.day1;

public class S3_2_정훈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a = b = 1; // a, b에 1이 들어가는 결과
		int n = 2;
		final int MAX = 10;

		System.out.println(a + " " + b);
		while (n <= MAX) {
			b = a + b;
			a = b - a;
			n = n + 1;
			System.out.println(b);
		}
	}

}
