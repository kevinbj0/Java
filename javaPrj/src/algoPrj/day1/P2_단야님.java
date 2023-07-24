package algoPrj.day1;

public class P2_단야님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // 누적합
		int jsum = 0;

		int i = 1; // 반복제어변수

		while (i <= 100) {
			jsum = jsum + i;
			sum = sum + jsum;
			i++;
		}
		System.out.println(sum);
	}

}
