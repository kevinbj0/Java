package day13.Object;

public class Ex02 {

	public static void main(String[] args) {
		B b1 = new B(5);
		B b2 = new B(5);
		
		//두개의 객체가 만들어진 것
	
		if(b1.equals(b2)) {
			System.out.println("같다");
		}
		
		//Object의 equals()는 객체의 주소를 비교합니다.
	}

}
