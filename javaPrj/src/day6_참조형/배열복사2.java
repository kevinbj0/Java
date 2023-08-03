package day6_참조형;

import java.util.Arrays;

public class 배열복사2 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,5,9};
		//int[] arr = {3,5,9}
		//배열복사
		
		int[] newArr = new int[3];
		
		System.arraycopy(arr, 0, newArr, 0, 3);
		
		System.out.println(Arrays.toString(newArr));
	}

}
