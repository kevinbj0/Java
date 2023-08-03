package day11_접근제어자;

public class 접근제어자 {

	public static void main(String[] args) {
		//접근제어자 : 접근에 대한 내용
		//public: 완전오픈, private 내 클래스안에서만 접근 허용
		//default : 기본값 -> 같은 패키지 안에 있는 클래스에게만 접근을 허용
		A.매서드1();
		A.매서드2();
		
		B.매서드1();
		B.매서드2();
		
		//default 제어자
		//C.매서드1();
		//C.매서드2();
	}

}
