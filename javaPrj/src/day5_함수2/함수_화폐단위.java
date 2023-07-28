package day5_함수2;

import java.util.Scanner;

public class 함수_화폐단위 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출장비입력: ");
		int money = sc.nextInt();	
		
		int [] moneyArray = MoneyCount(money);
		
        System.out.print("매수 출력 : ");
        for(int i=0 ; i < moneyArray.length; i++) {
            System.out.print(moneyArray[i] + " ");
        }
        
        System.out.print("\n다른 출력 :");
        //향상된 for문
        for(int i : moneyArray) { 
        	System.out.printf(" %d", i);
        }
	}

	public static int[] MoneyCount(int money) {
		int [] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int [] moneyArrMain = new int [moneyArr.length];
		
		for(int i = 0 ; i <moneyArr.length; i++ ) {
			moneyArrMain[i]= money / moneyArr[i];
			money %= moneyArr[i];
		}
		
        return moneyArrMain;
	}

}
