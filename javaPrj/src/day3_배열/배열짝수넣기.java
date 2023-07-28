package day3_배열;

import java.util.Scanner;

public class 배열짝수넣기 {

	public static void main(String[] args) {
		//1차원배열 10개 짝수만 배열에 저장하는 프로그램
		int[] even = new int[10];
		int count = 0;
		int input;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//수를 입력받아 짝수일 시 배열에 저장
			System.out.print("수를 입력하세요 = ");
			input = sc.nextInt();
			
			if(input %2 == 0) {
				even[count] = input;
				System.out.printf("입력값 짝수 -> %d번쨰 저장\n", count+1);
				count ++;
			}
			if(count == 10) {
				break;
			}
		}
		//완성된 배열출력
		System.out.print("\n완성된 짝수 배열 = {");
		for(int i = 0; i<even.length; i++) {
			System.out.printf(" %d ", even[i]);
		}
		System.out.print("}");
	}

}
