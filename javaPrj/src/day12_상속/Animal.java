package day12_상속;

public class Animal {
	boolean Inner;
	String name;
	
	public Animal() {
		
	}
	public Animal(boolean Inner, String name) {
		this.Inner = Inner;
		this.name = name;
	}
	
	public void 짖는다() {
		System.out.println( "짖는다");
	}
	
	public void 먹는다() {
		System.out.println( "먹는다");
	}
	
	public void 잠잔다() {
		System.out.println( "잠잔다");
	}
	
	public void printSuper() {
		System.out.println(name);
		System.out.println(Inner);
	}

}
