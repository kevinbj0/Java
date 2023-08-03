package day13.성적관리;

import java.util.ArrayList;

public class ScoreTest2 {

	public static void main(String[] args) {
		//객체배열
		ArrayList list = new ArrayList();
		
		//학생 등록하기
		Score s = new Score("박태민",100,99);
		Score s2 = new Score("박지원",100,100);
		
		list.add(s);
		list.add(s2);
		list.add(new Score("김민지",99,100));
		
		//삭제하기
		System.out.println("학생정보 삭제하기");
		int index = 1;
		list.remove(index-1);
		
		//조회하기
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		//김민지 학생의 정보를 조회하기
		System.out.println("김민지 학생 조회하기");
		String searchName = "김민지";
		for(int i=0; i<list.size(); i++) {
			Object o = list.get(i);
			String name = ((Score)o).getName();
			
			if(name.equals(searchName)) {
				//Object -> toString(); 이미 정의돼 있음
				//Score가 toString();을 재정의 한것(오버라이드)
				//부모형으로 참조해도 오버라이드된 실제 객체의 메서드가 호출된다.
				System.out.println(o.toString());
			}
		}
		
		//박지원 학생의 정보 변경하기
		//국어성적 => 99로 변경
		System.out.println("박지원 학생 국어점수 변경");
		for(int i=0; i<list.size(); i++) {
			Score score = (Score)list.get(i);
			if(score.getName().equals("박지원")) {
				score.setKor(99);
			}
		}
		
		
		
		
	}
}
