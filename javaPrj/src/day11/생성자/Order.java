package day11.생성자;

public class Order {
	private String id;
	private String name;
	private int date;
	private String address;
	
	public Order() {}
	
	public Order(String a, String b, int c, String d) {
		id = a;
		name = b;
		date = c;
		address = d;
	}
	
	public void print_info() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(date);
		System.out.println(address);
		
		return id + " " + name +" "+tostring(date);
	}
}

//주문번호: 201803120001
//주문자아이디: abc123
//주문날짜:2018년3월12일
//주문자이름: 홍길순
//주문상품번호😛D0345-12
//배송주소: 서울시 영등포구 여의도동 20번지