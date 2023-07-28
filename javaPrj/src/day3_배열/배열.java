package day3_배열;

public class 배열 {

	public static void main(String[] args) {
		//배열 사용해보기 1차원 2차원 3차원
		
		//변수 5개 선언
		int a, b, c, d, e;
		//1차원 배열 선언
		//c에서 배열을 선언하는 코드, 자바는 사용할 수 없음
		//int kors2[5];
		//int* arr2 = (int*)malloc(sizeof(int)*5); 
		
		//자바 배열 선언 방법
		//자바는 배열부터 heap 메모리 사용
		int[] kors = new int[5];
		int[] kors2 = {90,80,99,100,89}; //배열의 초기화블럭
		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 8;
		arr[3] = 9;
		arr[4] = 25;
		System.out.println(arr); //배열명을 출력시 배열의 첫 주소값을 출력(의미적 주소)
		//자바에서 물리적 주소는 출력되지 않음
		
		char[] arr1 = new char[5]; //char은 ''으로
		double[] arr2 = new double[5];
		String[] arr3 = new String[5]; //문자열은 ""으로
		int[] arr4 = new int[5];
		
		arr1[0] = '홍';
		arr1[1] = '대';
		arr1[2] = '에';
		arr1[3] = '이';
		arr1[4] = '콘';		
		
		char[][] arr5 = {
				{'홍','대'}, //char
				{'에','이'}, //char
		}; 
		System.out.println(arr1);
		System.out.println(arr5);
	}

}
