package day6_참조형;

public class 참조형변수 {

	public static void main(String[] args) {
		// 주소를 담아야 하는 상황
		int[] arr = new int[3];
		//arr : 참조형 변수(주소값을 저장하는 변수)
		//자바는 배열부터는 new 연산자(메모리요청), 반환값은 확보된 메모리의 위치값 정보
		//참조형변수의 기본값 : null
		
		int a; //기본형 변수
		int b;
		int[] c = new int[3]; //c 참조형 변수
		int[][] d = new int[3][2]; //d 참조형 변수
		String s; //참조형 변수
		
	}

}
