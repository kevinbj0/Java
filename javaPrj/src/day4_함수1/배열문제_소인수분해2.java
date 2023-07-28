package day4_함수1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열문제_소인수분해2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temperatures = { 27, 27, 28, 29, 30, 33, 32, 33, 32, 31, 31, 33, 33, 31 };
		Scanner sc = new Scanner(System.in);

		int in;
		int divisor_cnt = 0;
		int[] divisor = new int[30];
		
		// 30이하의 수 입력여부
		System.out.println("30 이하의 수를 입력하세요.");
		while (true) {
			in = sc.nextInt();
			if (in < 30)
				break;
			System.out.println("수를 다시 입력하세요.");
		}

		// 소수 배열에 저장
		int[] minority = new int[30];
		int minority_cnt = 0;
		for (int i = 2; i <= in; i++) { // 판별할 수
			
			boolean flag=true;
			for (int j = 2; j < i; j++) { // 판별할 수를 2부터 나누기
				
				if (i%j == 0) { // 나머지가 0이면 약수이므로 다음 수 판별
					flag=false;
					break;
				} 
			}
			
			if( flag) { // 소수만 배열에 저장
				minority[minority_cnt]= i;
				minority_cnt++;
			}
		}
		
		
		
		
		
		// 소인수분해를 배열에 저장
		System.out.print("입력한 수 : " + in + " = 1 * ");
		int a = in;
		for (int i = 0; i < minority_cnt; i++) {
			
			if (a % minority[i] != 0) {
				continue;
			} else {
				divisor[divisor_cnt] = minority[i];
				a = a / minority[i];
				divisor_cnt++;
				i--;
			}
			
		}

		// 배열 출력
		for (int i = 0; i < divisor_cnt; i++) {
			if (i == divisor_cnt - 1) {
				System.out.println(divisor[i]);
			} else {
				System.out.print(divisor[i] + " * ");
			}
		}
			
			
		

	}
}