package day6_참조형;

public class CallByValue {
	//CallByValue : 값을 보내는 것
	//수정해도 원본값은 수정안됨
	
	public static void main(String[] args) {
		int su1=9, su2 = 5;
		int sum = su1 + su2;
	
		System.out.println(sum);
		
		int su3 = 5, su4 = 6;
		int result = adder(su3, su4);
		System.out.println(su1);
		System.out.println(result);
	}
	//반환은 무조건 1개
	//반환이 없을 떄 void
	/*기능 : 두 수를 더해주는 기능, (함수명 작성 : 기능에 맞게 첫글자 소문자)
	 *작성자 : 우주연
	 *입력정보 : 두개의 정수*
	 *반환정보 : 두 수의 합
	 */
	
	public static int adder(int su1, int su2) {
		int sum = su1 + su2;
		su1 = 5;
		return sum;
	}

}
