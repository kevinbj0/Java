package day13.String;

public class Ex02 {

	public static void main(String[] args) {
		String str = new String("hello");
		//문자열 객체(속성(char[]) + 기능(메서드(함수)))
		
		//문자열 수정이 불가
		char result = str.charAt(0);
		System.out.println(result);
		
		
		System.out.println("ㅡㅡㅡㅡ 문자열 교체 ㅡㅡㅡㅡ");
		//str 문자열 객체의 내용은 바꿀 수 없다.
		//원본의 문자열이 수정되는 것은 아니다.
		//문자열의 내용을 다르게 대체(주의! 새로운 문자열을 반환함)
		String result2 = str.replace('e', 'a');
		System.out.println(result2);
		System.out.println("원본은 수정되지 않았음 = "+str);
		//원본이 변경된 것이 아님! 새로 받은것
		
		System.out.println("\nㅡㅡㅡㅡ 대문자로 변경 ㅡㅡㅡㅡ");
		//대문자로 변경
		String result3 = str.toUpperCase();
		System.out.println(result3);
		
		System.out.println("\nㅡㅡㅡㅡ 문자열 분리 ㅡㅡㅡㅡ");
		//문자열분리
		String date = new String("2023-08-03");
		String[] result4 = date.split("-");
		
		for(int i=0; i<result4.length; i++) {
			System.out.println(result4[i]);
		}
		
		System.out.println("\nㅡㅡㅡㅡ 시작지점부터 받기 ㅡㅡㅡㅡ");
		//시작지점부터 받아와라
		String result5 = date.substring(5);
		System.out.println(result5);
		
		System.out.println("\nㅡㅡㅡㅡ 범위지정해서 받기 ㅡㅡㅡㅡ");
		//범위지정해서 받아옴
		String result6 = date.substring(5, 7); //5,6인덱스
		System.out.println(result6);
		
		System.out.println("\nㅡㅡㅡㅡ 문자열의 길이 ㅡㅡㅡㅡ");
		System.out.println(date.length());
		
		System.out.println("\nㅡㅡㅡㅡ 문자열 비교 ㅡㅡㅡㅡ");
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1.equals(s2));
		
	}

}
