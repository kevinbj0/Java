package day10.ClassType;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[] {0,1,2};
		int[] test2 = test;
		
		test2[1] = 3;
		System.out.println(test[1]);
		System.out.println(test2[1]);
	}

}
