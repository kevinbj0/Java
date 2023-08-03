package day6_참조형;

import java.util.Arrays;

public class 배열삭제 {

	public static void main(String[] args) {
		int[] arr = {5,2,8,9};
		//삭제할 index = 2(8을 삭제)
		int index = 2;
		
		int[] newArry = new int[arr.length -1];
		
		
		for(int i=0; i<index; i++) {
			newArry[i] = arr[i];
		}
		for(int i = index; i<newArry.length; i++) {
			newArry[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(newArry));
	}

}
