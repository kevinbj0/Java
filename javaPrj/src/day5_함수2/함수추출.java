package day5_함수2;

public class 함수추출 {

	public static void main(String[] args) {
		// 함수 뺴내는 기능
		// 드래그 + 우클릭 -> Rafactor -> extract 매서드
		getSum();
	}
	
	//void => 반환값이 없다
	public static void getSum() {
		int sum=0;		
		for( int i=1; i<=10 ; i++) {
			sum+=i;
		}		
		System.out.println( sum);
	}

}
