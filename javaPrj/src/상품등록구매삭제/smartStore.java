package 상품등록구매삭제;

import java.util.Scanner;

public class smartStore {
	static Scanner sc = new Scanner(System.in);
	static int NUM = 5; //최대 상품수
	static int MAX_ORDER = 10; //최대 주문수
	static int todayOrder = 0;
	
	
	
	public static void main(String[] args) {
		
		Item[] item = new Item[NUM]; //상품목록
		Order[] orderList = new Order[MAX_ORDER]; //주문목록
	
		//로그인
		System.out.print("아이디를 입력하세요(아무거나) : ");
		String userId; //아이디 입력
		userId = sc.next();
		System.out.println("\nㅡ 환영합니다 ㅡ\n");

		//초기화
		Init(item, orderList);
		
		loop:while(true){
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("1.등록, 2.삭제, 3.구매, 0.종료 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: //등록하기
				insertItem(item);
				break;
			case 2: //삭제하기
				deleteIndex(item);
				break;
			case 3: //구매하기
				todayOrder = buyItem(item, orderList, userId);	
				break;
			case 0: //종료
				System.out.println("종료");
				break loop;
			default: //잘못된 입력
				System.out.println("잘못된 입력");
			}
		}
	}

	public static int buyItem(Item[] item, Order[] orderList, String userId) {
		int buyIndex;
		System.out.print("구매할 상품번호 : ");
		buyIndex = sc.nextInt();
		System.out.println("구매할 상품 : "+item[buyIndex-1].itemName);
		System.out.print("주문자 이름 : ");
		String name = sc.next();
		
		System.out.print("주소입력 : ");
		String address = sc.next();
		
		Order newOrder = new Order();
		newOrder.id = userId;
		newOrder.name = name;
		newOrder.address = address;
		newOrder.itemNum = item[buyIndex-1].itemNum;
		newOrder.orderNum += todayOrder;
		orderList[todayOrder] = newOrder;
		System.out.println("\n ㅡㅡ 주문서 확인 ㅡㅡ");
		System.out.println("| 주문번호 : " + orderList[todayOrder].orderNum);
		System.out.println("| 주문자아이디 : " + orderList[todayOrder].id);
		System.out.println("| 주문날짜 : " + orderList[todayOrder].date);
		System.out.println("| 주문자이름 : " + orderList[todayOrder].name);
		System.out.println("| 주문상품번호 : " + orderList[todayOrder].itemNum);
		System.out.println("| 배송주소 : " + orderList[todayOrder].address);
		todayOrder++;
		return todayOrder;
	}

	public static void deleteIndex(Item[] item) {
		int deleteIndex;
		System.out.print("몇번칸을 삭제할까요? ");
		deleteIndex = sc.nextInt();
		
		Item newItem = new Item();
		item[deleteIndex-1] = newItem;
		
		printItem(item);
	}

	public static void Init(Item[] item, Order[] orderList) {
		//상점 초기화
		System.out.println("ㅡㅡㅡㅡ상품 목록ㅡㅡㅡㅡ");
		for(int i = 0; i<NUM; i++) {
			item[i] = new Item();
			System.out.println((i+1) + "."+item[i].itemName);
		}
		//주문목록 초기화
		for(int i = 0; i<MAX_ORDER; i++) {
			orderList[i] = new Order();
		}
	}

	//상품등록
	public static void insertItem(Item[] item) {
		int newIndex;
		System.out.print("몇번칸에 등록할까요? ");
		newIndex = sc.nextInt();
		
		System.out.print("등록할 상품이름 : ");
		String name = sc.next();
		
		System.out.print("상품 코드 번호 : ");
		String itemNum = sc.next();
		
		Item newItem = new Item();
		newItem.itemName = name;
		newItem.itemNum = itemNum;
		item[newIndex-1] = newItem;
		
		printItem(item);
	}

	
	
	public static void printItem(Item[] item) {
		System.out.println("ㅡㅡㅡㅡ상품 목록ㅡㅡㅡㅡ");
		for(int i=0; i<item.length; i++) {
			System.out.println((i+1)+"."+item[i].itemName);
		}
	}
}

//주문번호: 201803120001
//주문자아이디: abc123
//주문날짜:2018년3월12일
//주문자이름: 홍길순
//주문상품번호😛D0345-12
//배송주소: 서울시 영등포구 여의도동 20번지
