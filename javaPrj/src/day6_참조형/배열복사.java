package day6_참조형;

import java.util.Arrays;

public class 배열복사 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,5,9};
		//int[] arr = {3,5,9}
		//배열복사
		
		int[] newArr = new int[4];
		
		newArr = arr;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}

}
