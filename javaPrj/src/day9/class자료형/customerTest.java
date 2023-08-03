package day9.class자료형;

import java.util.Arrays;

public class customerTest {

	public static void main(String[] args) {
		int a;
		//배열, 객체는 메모리에 공간을 확보하는 행위를 할 떄는 new로 힙 메모리 사용 강제
		Customer b = new Customer();
		b.age = 30;
		
		System.out.println(b.name);
		System.out.println(b.id);
		System.out.println(b.age);
	}

}
