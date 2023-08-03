package day13.String;

public class Ex01 {

	public static void main(String[] args) {
		
		//문자옇을 생성하는 방식 2가지
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ방법 1
		//한번 생성됩니다. 
		//정적영역(상수영역에 생성됩니다)
		//같은 문자열을 사용할 때는 별도의 공간을 확보하는 것이 아니라
		//주소만 제공받습니다.
		String str0= "Hello"; //"Hello"한개만
		String str1= "Hello";
		//문자열 수정 불가 
		//같은 코드 1000번 주면 한번만 만들어지고 이후 주소값을 받음
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ방법 2
		//2개가 각각 생성됩니다.
		//heap메모리에 각각 생성됩니다.
		String str2 = new String("Hello");
		String str3 = new String("Hello");
		//문자열 수정 불가(final char[] value)
		//같은 코드 1000번 주면 1000번 만들어짐
	}

}
