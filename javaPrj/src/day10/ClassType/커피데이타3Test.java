package day10.ClassType;

public class 커피데이타3Test {

	public static void main(String[] args) {
		//커피정보를 담을 수 있는 변수가 만들어짐
		커피데이타3 coffee = new 커피데이타3();
		
		//값을 지정
		coffee.input (1000,2000,100,1000);

		//값을 출력
		coffee.printInfo();
		//System.out.println(coffee.설탕);
	}

}
