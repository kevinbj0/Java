package 오버라이드다형성연습;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0.초보자 1.궁수 2.전사");
		System.out.print("직업을 선택하세요 : ");
		Player player = new Player();
		String End;
		
		int select = sc.nextInt();
		if(select == 1) {
			player = new Archer();
		}else if(select == 2) {
			player = new Warrior();
		}
		
		End = player.GameEnding();
		System.out.printf("플레이어 HP : %d",player.Hp);
		System.out.printf("플레이어 공격력 : %d",player.Attack);
		System.out.println(End);
	}

}
