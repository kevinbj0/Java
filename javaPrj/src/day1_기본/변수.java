package day1_기본;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 : 메모리블럭, 기억장소(공간), 기억장소를 식별하기 위한 이름
		int a; 
		int b; //기억공간 기억장소를 확보함
		
		//자료형
		//크기 + 해석방법
		//자료형(공간의 크기와 내용을 해석하는 방법을 제공)
		
		/*
		*	byte : 1byte (8bit, 1bit sign -128~127)
		*	int : 정수형, 4바이트 (+- 약 21억)
		*	short : 2byte (16bit) -32768 ~ 32767
		*	long : 8byte (64bit) 
		*		
		*	char : 2byte - 문자 1개를 저장할 수 있는 공간
		*	ex) char ch = 'a'; 
		*		 char ch1 = '한'; 다른 언어와 다르게 자바는 한글도 1문자로 표현 가능하다
		*
		*   double : 8byte //소수점 15자리까지 표현가능
		*   float : 4byte //소수이하 7자리 표현
		*   
		*   boolean : 논리형 true (0이 아닌값), false(0인값)
		*  	ex) boolean flag = true;
		*	
		*  
		*/
		
		//		리터럴 : 값자체 , 10, 10.3, 'a', "Hello", true
		//		상수영역에 저장된다.
		//		크기를 가진다.
		//		정수형값 int 형 저정
		//		실수형값 double 형 저장
		
		int iNum = 334; 
		// 1. 334라는 값이 상수영역에 저장되는 것이 문제 없는지
		// 2. iNum이라는 기억장소에 저장되는 것이 문제 없는지
		
		
		long iLong = 2200000000L;
		//22억이라는 값을 상수 영역에 저장하는 것에 문제 발생 
		//L을 붙여서 int형이 아닌 long형 변수라는 것을 표시
		
		double d = 23.3; //23.3 실수형 리터럴이 double형으로 상수영역에 저장 
		
		float f = 23.3f; // double형이 float 에 저장될 때 문제발생
						 //숫자 f 표시해야 float 형 상수로 저장됨
		
		char ch = 'a'; //한 문자를 저장하기 위함
		// ' ' 한문자를 표현 " " x
		// 2바이트 사용
		
		char ch2 = '김';
		//문자열 표현
		//문자열은 문자 여러개의 집합
		
		char[] str = {'g','o','d'};
		System.out.println(str);
		
		String str2 = "i like jave";
		System.out.println(str2);
		
		
		char result = str2.charAt(3);
		System.out.println(result);
		
		//논리값을 저장할 수 있는 자료형 boolean true, false
		boolean flag = true;
		
		if (flag == true) {
			System.out.println("조건실행");
		}
		
		if(flag) {
			System.out.println("-> 조건이 참입니다.");
		}else {
			System.out.println("-> 조건이 거짓입니다.");
		}
	}

}
