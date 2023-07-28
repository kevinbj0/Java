package day6_참조형;

public class CallByReference {
	//CallByReference : 주소를 보내는 것
	
	public static void main(String[] args) {
		int[] arr = {10,9,8,5};
		input(arr);
		printArray(arr);
		
		//기본형 변수 : 값을 저장하는 변수(메모리 공간)
		//참조형 변수 : 참조값(주소값)을 저장하는 변수(메모리 공간)
		//call by reference
	}
	
	public static void input(int[] a) {
		//주소를 가져와서 넣어준다
		a[0] = 10;
		a[1] = 90;
		a[2] = 80;
	}
	public static void printArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
