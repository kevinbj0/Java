package javalang.day1;

public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//분기문 if, switch
		//if 문 형식
		/*
		 * if(조건식)
		 * 
		 */
		
		int myAge = 26;
		int yourAge = 27;
		
		int score = 90;
		
		if(score  >=90) {
			System.out.println("학점은 A");
		}else if(score>=80) {
			System.out.println("학점은 B");
		}
		
		
		//if문 사용시 주의사항
		if (score >= 90) {
			System.out.println("학점은 A");
		}
		if(score >= 80) {
			System.out.println("학점은 B");
		}
		
		
	}

}
