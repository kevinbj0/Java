package day12.인터페이스.추상;

//구현이 안된 매서드 -> 추상매서드
abstract class  추상매서드 {
	//매서드 선언부만 가지고 있는 것, 미완성코드 
    //public void dance(); //미완성 코드
	//public void dance() { //완성 코드
	//}
	public void 걷는다() {
		System.out.println("걷는다.");
	}
	public abstract void dance();
}