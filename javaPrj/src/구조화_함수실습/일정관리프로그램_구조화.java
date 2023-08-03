package 구조화_함수실습;

import java.util.Arrays;
import java.util.Scanner;

public class 일정관리프로그램_구조화 {
	static Scanner sc = new Scanner(System.in);
	static String[][] work = new String[10][5];
	static int[] index = new int[10];
	static String day; //String형
	static int day_ = 0; //정수형 변환

	public static void main(String[] args) {
		//일정을 관리하는 프로그램 10개
		//모든값을 0으로 
		Arrays.fill(index, 0);
		
		loop:while(true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("메뉴선택: 1:등록, 2:조회, 3:변경, 4:삭제, 5:종료");
			String menu = sc.nextLine();
			switch(menu) {
			case "1": //등록
				insertWork();
				break;
			case "2": //조회
				System.out.println("ㅡㅡㅡㅡ조회ㅡㅡㅡㅡ");
				printWork();
				break;
			case "3": //변경
				updateWork();
				break;
			case "4": //삭제
				deleteWork();
				break;
			case "5": //종료
				break loop;
			default: //잘못된 입력
				System.out.println("잘못된 입력");
			}
		}
	}

	public static void deleteWork() {
		System.out.println("ㅡㅡㅡㅡ삭제ㅡㅡㅡㅡ");
		dayInput();
		System.out.println("삭제할 일정 선택");
		
		for(int i =0; i<index[day_-1]; i++) {
			System.out.println((i+1)+"."+work[day_-1][i]);
		}
		String deleteIndex_ = sc.nextLine();
		int deleteIndex = Integer.parseInt(deleteIndex_);
		//일정 삭제부분
		index[day_-1]--;
		for(int i = deleteIndex; i< work[day_-1].length; i++) {
			work[day_-1][i-1] = work[day_-1][i];
		}
		System.out.println("ㅡㅡㅡㅡ현재 일정ㅡㅡㅡㅡ");
		for(int i =0; i<index[day_-1]; i++) {
			System.out.println((i+1)+"."+work[day_-1][i]);
		}
	}

	public static void updateWork() {
		System.out.println("ㅡㅡㅡㅡ변경ㅡㅡㅡㅡ");
		dayInput();
		for(int i =0; i<index[day_-1]; i++) {
			System.out.println((i+1)+"."+work[day_-1][i]);
		}
		System.out.println("변경할 순번과 내용을 입력");
		String updateIndex_ = sc.nextLine();
		int updateIndex = Integer.parseInt(updateIndex_);
		String updateDay = sc.nextLine(); //중간에 스페이스 가능유무
		work[day_-1][updateIndex-1] = updateDay;
	}

	public static void dayInput() {
		System.out.print("날짜선택(1~10) : ");
		day = sc.nextLine();
		day_ = Integer.parseInt(day);
	}

	public static void insertWork() {
		System.out.println("ㅡㅡㅡㅡ등록ㅡㅡㅡㅡ");
		dayInput();
		System.out.print("추가할일정 : ");
		
		String input = sc.nextLine();
		work[day_-1][index[day_-1]] = input;
		index[day_-1]++;
	}

	public static void printWork() {
		dayInput();
		day_ = Integer.parseInt(day);
		for(int i =0; i<index[day_-1]; i++) {
			System.out.println((i+1)+"."+work[day_-1][i]);
		}
	}
}
