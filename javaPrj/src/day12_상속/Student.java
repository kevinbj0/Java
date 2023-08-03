package day12_상속;

//기본생성자가 없으면 오류가 생긴다
public class Student extends Person{
	int classNo;
	
	public Student(String name, String id, int classNo) {
		//값의 초기화 (생성자)
		//super();//기본적으로 부모의 기본생성자를 호출합니다.
		super(name, id);//이름과 id는 부모생성자가 해결해줘
//		this.name = name;
//		this.id = id;
		this.classNo = classNo;
	}
	
	public String toString() {
		return name + id +" "+ classNo;
	}
}
