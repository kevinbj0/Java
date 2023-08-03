package day6_참조형;

public class 함수리턴 {

	public static void main(String[] args) {
		int[] arr = new int[] {9,8,7};
		printArray(arr);
		
	}
	
	public static void printArray(int[] a) {
		for(int num : a) {
			System.out.print(num + " ");
		}
	}

}
