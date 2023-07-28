package day3_배열;

public class 배열2차원 {

	public static void main(String[] args) {
		// 좋아하는 과일 5개
		// 좋아하는 음료 5개
		// 1차원 배열
		String[] fruits = { "애플망고", "망고", "블랙사파이어", "블루베리", "체리" };
		String[] beverage = { "아아", "고구마라때", "피스타치오프라페", "아바라", "망고블랜더" };

		// 2차원 배열 선언 [행][열]
//		String[][] favorites = new String[2][5];
		String[][] favorites = { 
				{ "애플망고", "망고", "블랙사파이어", "블루베리", "체리" },
				{ "아아", "고구마라때", "피스타치오프라페", "아바라", "망고블랜더" }, 
				};

		// 2차원 배열 출력
		System.out.println("2차원 배열 출력");
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				System.out.print("과일 = ");
			}
			if (i == 1) {
				System.out.print("음료 = ");
			}
			for (int j = 0; j < 5; j++) {
				System.out.printf(" %s ", favorites[i][j]);
			}
			System.out.println();
		}

	}

}
