package javalang.day1;

import java.util.Scanner;

public class 반복문 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요");
		}
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			System.out.println("계속");
			int su = sc.nextInt();
			if(su == 0) {
				break;
			}
		}
		
		while(true) {
			int su = sc.nextInt();
			if(su == 100)break;
			System.out.println(su + "계속 . . .");
		}
	}

}
