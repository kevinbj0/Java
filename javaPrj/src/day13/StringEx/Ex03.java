package day13.StringEx;

public class Ex03 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Hello");
		//얘는 원본도 바뀜
		//문자열 교체
		s.setCharAt(1,'a');
		System.out.println(s);
	
		//문자열 추가
		s.append("i like java");
		System.out.println(s);
	}

}
