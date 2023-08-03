package day11.생성자;

public class Score메인 {

	public static void main(String[] args) {
		//객체는 new (동적메모리) 방식으로 공간을 확보합니다.
		//확보된 공간의 주소(래퍼런스)를 저장한 뒤 사용합니다.
		//반드시 참조형변수가 필요하다!!
		//참조형변수 : 주소(래퍼런스)를 저장하는 변수입니다.
		//참조형변수의 기본값 : null 
		//null : 참조하지 않는 상태
		Score s = null; // s 참조형 변수
		s = new Score();
		s.calResult();
		s.pringInfo();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		Score s2 = new Score("허재혁", 100, 100, 100);
		s2.calResult();
		s2.pringInfo();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		Score s3 = new Score("김민규");
		s3.calResult();
		s3.pringInfo();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(new char[] {'a','b','c'});
		char[]chs = new char[] {'a','b','c'};
		System.out.println(chs);
	}

}
