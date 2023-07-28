package day2_파일;

import java.util.Scanner;

public class breakEx2 {
	public static void main(String[] args) {
		//메뉴 1.등록 2.조회 3.변경 4.삭제
		Scanner sc = new Scanner(System.in);
		
		int menu=0;

		
		loop:while(true)
		{		
			System.out.print("메뉴 1.등록 2.조회 3.변경 4.삭제 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("등록선택");
				break;
			case 2:
				System.out.println("조회선택");
				break;
			case 3:
				System.out.println("변경선택");
				break;
			case 4:
				System.out.println("삭제선택");
				break;
			case 5:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("다시선택");
			}
		}
	}
}
