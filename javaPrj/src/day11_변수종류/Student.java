package day11_변수종류;

public class Student {
	String name;
	int kor;
	int eng;
	double avg;
	String teacher;
	
	public Student() {
	}
	
	//매개변수가 있는 생성자
	public Student(String name, int kor, int eng, String teacher) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.avg = (kor+eng)/2.0;
		this.teacher = teacher;
	}
	
	public String toString() {
		return name+" "+ kor + " " + eng + " " + avg + " " + teacher;
	}
}
