package day4_함수1;

import java.util.Scanner;

public class 소인수분해 {

	public static void main(String[] args) {
		// 소인수분해
		
		
		int[] result = new int[100];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 : ");
		int number = sc.nextInt(); 
		
		for (int i=2; i<=number; i++) {
			if(number%i != 0) {
				continue;
			}
			else {
				number = number/i;
				result[count] = i;
				count ++;
				i--;
			}
		}
		
		//배열출력
		System.out.print("소인수분해 = ");
		for(int i=0; i<count; i++) {
			if(i==count-1) {
				System.out.printf("%d", result[i]);
				break;
			}
			System.out.printf("%dx", result[i]);
		}
	}
}
