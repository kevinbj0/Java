package javalang.day2;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next(); //string이면 next
		int kor = sc.nextInt(); //숫자면 nextInt
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum/3.0;
		
		System.out.println(name + " " + kor + " " + eng + " " + math + " " + sum + " " + avg);
	}

}
