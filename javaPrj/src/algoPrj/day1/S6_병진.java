package algoPrj.day1;

public class S6_병진 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		int sw = 0;
		float num = 0;
		float sum = 0;
		// 몇 팩토리얼
	    // 분자값
	    // 부호값
	    // 합
		
		//#region 안
		for (k=1; k<=10; k++) {
			// 분자값 정해줌
			num = k;
			// 팩토리얼 연산
			for (int i=0; i<k; i++) {
				num = num/(k-i);
			}
			//부호 결정
			if(sw == 0) {
				sum = sum + num;
				sw = 1;
				System.out.println(k + "번째 값 : + " + num);
			}else {
		          sum = sum - num;
		          sw = 0;
		          System.out.println(k + "번째 값 : - " + num);
		    }
		}
		//#endregion
		System.out.println("\nSUM : " + sum);
	}
}
