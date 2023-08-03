package day12.객체배열;

public class Score {
	String no;
	int kor;
	int eng;
	int tot;
	
	//생성자
	public Score() {}

	public Score(String no, int kor, int eng, int tot) {
		super();
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.tot = tot;
	}
	
	@Override
	//부모의 매서드의 재정의
	public String toString() {
		return no + " " + kor + " " + eng + " " + tot;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
}
