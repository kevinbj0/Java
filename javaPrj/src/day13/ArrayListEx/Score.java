package day13.ArrayListEx;

public class Score {
	//멤버변수
	private String name;
	private int kor;
	private int eng;
	private String result;
	
	//써터 Set 첫글자 대문자 
	//게터 Get 
	//Getter Setter 우클릭 제터레이터 세터 게터
	/*
	public void setKor(int kor) { // ex)양수일떄만 넣어라
		if(kor>0) {
			this.kor = kor;
		}
	}*/
	

	public void calResult() {
		int sum = kor + eng;
		double avg = sum/2.0;
		if(avg>=80) 
			result="합격";
		else 
			result="불합격";
	}
	

	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//생성자
	//this : 참조형 변수, 자기참조형 변수 (클래스 타입)
	//단, static매서드에는 this가 전달되지 않습니다.
	public Score() {
		
	}
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		calResult();
	}
	
	/*
	//static매서드는 클래스명.print()로 바로 사용가능
	public static void print() {
		System.out.println("********************");
		System.out.println(name); //멤버변수(인스턴스변수를 사용할 수 없다. )
		
	}*/
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", result=" + result + "]";
	}
	
	
}
