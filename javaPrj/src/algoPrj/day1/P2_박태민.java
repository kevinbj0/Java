package algoPrj.day1;

public class P2_박태민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int sum=0;
		
		while(n<=100) { //100미만일떄
			n = n+1;
			sum = sum+n*(101-n);
		}
		System.out.println(sum);
	}

}
