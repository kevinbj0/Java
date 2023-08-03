package day6_참조형;

public class CallByReference2 {
	// CallByReference : 주소를 보내는 것
	// 주소값을 주기 떄문에 원본 값이 수정됨

	public static void main(String[] args) {
		int[] kors = new int[3];

		// 등록
		kors[0] = 5;
		kors[1] = 8;
		kors[2] = 9;
		
		//조회 
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		
		System.out.println("ㅡㅡ변경ㅡㅡ");
		input(kors);
		output(kors);
	}
	
	
	public static void input(int[] a) {
		a[0] = 7;
		a[1] = 38;
		a[2] = 12;
	}
	
	public static void output(int[] a) {
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}
