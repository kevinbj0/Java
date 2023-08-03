package day13.성적관리;

public class ScoreTest {

	public static void main(String[] args) {
		
		Score s = new Score("홍길동",90,90);
		s.calResult(); //s의 주소가 인자로 넘어감(보이진 않음) -> Score this
		
		String result = s.toString();
		System.out.println(result);
		System.out.println(s);
	}
}
