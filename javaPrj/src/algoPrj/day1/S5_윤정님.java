package algoPrj.day1;

public class S5_윤정님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 2;
		int n = 2;
		int i = 1;

		while (i < 7) {
			n=n*3; //항을 구한다
			sum = sum +n; //항을 누적한다
			i++;
		}
		
		System.out.println(sum);
	}

}
