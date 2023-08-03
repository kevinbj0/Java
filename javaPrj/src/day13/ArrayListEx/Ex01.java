package day13.ArrayListEx;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList<Score> list = new ArrayList<>();
		
		Score s = new Score("박태민",100,99);
		Score s2 = new Score("박지원",100,100);
		
		//등록하기
		System.out.println("등록하기");
		list.add(s);
		list.add(s2);
		list.add(new Score("김민지",99,100));
		
		//전체 조회하기
		System.out.println("전체 조회하기");
		for(int i=0; i<list.size(); i++) {
			Score score = list.get(i);
			System.out.println(score);;
		}
		
		//한명조회하기
		System.out.println("\n박지원님 성적정보 조회하기");
		for(int i=0; i<list.size(); i++) {
			Score score = list.get(i);
			String name = score.getName();
			if(name.equals("박지원")) {
				System.out.println(score);
			}
		}
		
		//삭제하기
		int index = 1;
		list.remove(index-1);
		
		//변경하기
		//김민지님 성적을 변경
		System.out.println("\n김민지학생의 영어성적을 변경");
		String searchName = "김민지";
;		for(int i=0; i<list.size(); i++) {
			Score score = list.get(i);
			if(score.getName().equals("김민지")) {
				score.setEng(98);
			}
		}
	}
}
