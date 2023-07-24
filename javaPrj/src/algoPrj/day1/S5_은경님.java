package algoPrj.day1;

public class S5_은경님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 2;
		int i = 1;

		while (i <= 7) {
			sum += n;
			n = n * 3;
			System.out.print(n + ", ");
			i++;
		}
		System.out.println("\n sum = "+sum);
	}

}
