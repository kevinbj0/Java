package 오버라이드다형성연습;

import java.util.Scanner;

public class Player {
	int Hp;
	int Attack;
	String End;
	
	//ㅡㅡㅡㅡ 생성자 ㅡㅡㅡㅡㅡ
	public Player(){ //직업선택 x 
		this.Hp = 100;
		this.Attack = 4;
	}
	//생성자2
	public Player(int hp, int attack) {
		Hp = hp;	
		Attack = attack;
	}

	public String GameEnding() {
		this.End = "세상을 구했습니다.";
		return End;
	}
}
