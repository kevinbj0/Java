package day1_기본;

public class 별찍기 {

	public static void main(String[] args) {

//		5개에서 1개씩 줄어드는 별
//		for(int i=5; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println("");
//		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<(i*2)-1; j++){
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
