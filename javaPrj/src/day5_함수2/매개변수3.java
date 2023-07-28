package day5_함수2;

public class 매개변수3 {

	public static void main(String[] args) {
		int[] result = a(4,2);
		int[][] result2 = b(4,2);
		
		System.out.println("배열1");
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println("배열2");
		for(int i=0; i<result2.length; i++) {
			for(int j=0; j<result2[i].length; j++) {
				System.out.println(result2[i][j]);
			}
		}
	}
	
	//반환은 한개만 가능
	public static int[] a(int a, int b) {
		int[] result = {a,b};
		
		return result;
	}
	
	public static int[][] b(int a, int b){
		int[][] result = {{a,b},{3,4}};
		
		return result;
	}
}
