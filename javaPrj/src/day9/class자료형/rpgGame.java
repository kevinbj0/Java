package day9.class자료형;

import java.util.Arrays;

public class rpgGame {

	public static void main(String[] args) {
		 
		Player[] user3 = new Player[3];		
		user3[0]= new Player();
		user3[0].item[0] = "검";
		
		System.out.println(user3[0].item[0]);
		System.out.println(Arrays.toString(user3[0].item));
		
//		테스트용 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		System.out.println(Arrays.toString(user[1].item));
//		
//		user[0].hp = 10;
//		System.out.println(user[0].hp);
		
		Player user1 = new Player();
		Player user2 = new Player();
		
		user1.hp -= 40;
		System.out.println(user1.hp);
		System.out.println(user2.hp);
		
		Player[] userpool = {user1,user2};
		System.out.println(userpool[0].hp);
		
	}

}
