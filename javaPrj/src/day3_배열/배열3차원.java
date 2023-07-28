package day3_배열;

public class 배열3차원 {

	public static void main(String[] args) {
		// 3차원 배열 안쓰고
		int[][] even = { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }, };

		int[][] odd = { { 1, 3, 5 }, { 7, 9, 11 }, { 13, 15, 17 }, };

		int[][][] numbers = { { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }, },
				{ { 1, 3, 5 }, { 7, 9, 11 }, { 13, 15, 17 }, } };
		
		System.out.println(numbers[1][0][1]);

		System.out.println("ㅡㅡ 짝수 ㅡㅡ ");
		for (int i = 0; i < even.length; i++) {
			for (int j = 0; j < even[i].length; j++) {
				System.out.print(even[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("ㅡㅡ 홀수 ㅡㅡ");
		for (int i = 0; i < odd.length; i++) {
			for (int j = 0; j < odd[i].length; j++) {
				System.out.print(odd[i][j] + " ");
			}
			System.out.println();
		}

	}

}
