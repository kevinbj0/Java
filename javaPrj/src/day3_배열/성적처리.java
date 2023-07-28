package day3_배열;

import java.util.Scanner;

public class 성적처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg;
		double kor_avg, eng_avg, math_avg;

		String name;
		int kor, eng, math;
		int sum = 0, kor_sum = 0, eng_sum = 0, math_sum = 0;

		final int MAX = 5;
		final int SUBJECT = 3;

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= MAX; i++) {
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			sum = kor + eng + math;
			avg = (double) sum / SUBJECT; // 나누기연산 -> 한쪽이 double이면 double로 바뀜

			kor_sum += kor;
			eng_sum += eng;
			math_sum += math;

			if (avg >= 90) {
				System.out.printf("%s %d %d %d \n평균 : %.3f\nexcellent\n", name, kor, eng, math, avg);
			} else if (avg > 60) {
				System.out.printf("%s %d %d %d \n평균 : %.3f\ngood\n", name, kor, eng, math, avg);
			} else {
				System.out.printf("%s %d %d %d \n평균 : %.3f\nbad\n", name, kor, eng, math, avg);
			}

			// 반복문 종료
			kor_avg = (double) kor_sum / MAX;
			eng_avg = (double) eng_sum / MAX;
			math_avg = (double) math_sum / MAX;

			System.out.println(kor_avg);
			System.out.println(eng_avg);
			System.out.println(math_avg);
		}
	}

}
