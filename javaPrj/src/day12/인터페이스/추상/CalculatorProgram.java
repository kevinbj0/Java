package day12.인터페이스.추상;

import java.util.Scanner;

public class CalculatorProgram {		
	 public static void main(String[] args) {	
		 
		 Scanner sc = new Scanner(System.in); 		 
		 System.out.print("두 수입력");
		 int num1= sc.nextInt();
		 int num2= sc.nextInt();		 		 	 
		 CalculatorI  cal = new MyCalculator_BJ();		 
		 int result  =cal.add(num1, num2);
		 System.out.println( result);
		 
	 } 
	

}
