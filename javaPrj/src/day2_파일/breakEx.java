package day2_파일;

public class breakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch
		//while, for 반복문에서 break
		//1-10까지 합
		
		int i = 0;
		int sum = 0;
		while(true) { //무한루프
			i++;
			if(i>10) {
				break;
			}
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
