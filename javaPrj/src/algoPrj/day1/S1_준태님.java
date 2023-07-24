package algoPrj.day1;

public class S1_준태님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언
		double hp = 250; //h시 인구
		double hu = 0.036; //h시 증가율
		double hup = 0; //h시 증가인구
		
		double kp = 180;
		double ku = 0.042;
		double kup = 0;
		
		int y = 1999; //기준년도
		int c = 0; //k시 증가율
		int sum; //출력변수 k시가 h시를 넘어설 때 년도
		
		while(kp <= hp) {
			hup = hp * hu; 
			hp = hp + hup;
			
			kup = kp * ku;
			kp = kp + kup;
			
			c = c+1;
			System.out.println("h시 : "+hp);
			System.out.println("k시 : "+kp);
		}
		sum = y + c;
		System.out.println(sum);
		
		
	}//end
}
