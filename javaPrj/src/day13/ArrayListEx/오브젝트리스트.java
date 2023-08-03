package day13.ArrayListEx;

public class 오브젝트리스트 {
	
	private Object[] nums;
	private int current;
	
	
	public 오브젝트리스트() {		 
		nums = new Object[3];
		current=0;
	}
	
	
	public int size() {
		return current;
	}
	
	public void add(Object obj) {
		
		 
		nums[current] = obj;
		current++;
		
	}
	
	public void clear(){
		//current 초기화
		current=0;
		// nums= new int[3];		
	}
	
	
	public Object get(int index)    { 
		
		return  nums[index];
	
	}

	public static void main(String[] args) {
		
		오브젝트리스트 list = new 오브젝트리스트();
	 
		list.add(3);
		list.add(5);
		list.add(4);
		//list.add(5);
	
		for(int i=0; i< list.size(); i++) {
			System.out.println( list.get(i));
		}
		
	}
}
