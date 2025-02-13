package topic02;

import java.util.Scanner;
public class JPA208 {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA208 分數制度
		//(1) 請寫出一個可以輸入學生分數，並判斷分數等級的程式。
		//(2) 當分數>=90分，等級為 A，顯示【Your grade is A】。
		//(3) 當分數介於 90 分到 80 分之間，例如 90 分 > 分數 >= 80 分，等級為 B，顯示【Your grade is B】。
		//(4) 當分數介於 80 分到 70 分之間，例如 80 分 > 分數 >= 70 分，等級為 C，顯示【Your grade is C】。
		//(5) 當分數介於 70 分到 60 分之間，例如 70 分 > 分數 >= 60 分，等級為 D，顯示【Your grade is D】。
		//(6) 當分數小於 60 分以下，例如 60 分 > 分數，等級為 F，顯示【Your grade is F】。
		//(7) 程式執行時，畫面顯示【Input:】，請使用者輸入一個整數。
		//(8) 重複執行五次，顯示如執行結果參考畫面。
		//---------------------------------------------------------------------------------------------
		// Input:
		// 92
		// Your grade is A
		// Input:
		// 80
		// Your grade is B
		// Input:
		// 79
		// Your grade is C
		// Input:
		// 60
		// Your grade is D
		// Input:
		// 59
		// Your grade is F
		for(int i =0;i<5;i++) {
			score2Lv();
		}		
	}

	public static void score2Lv() {
		System.out.println("Input:");
		int g = s.nextInt();
		
		if(g>=90) {
			System.out.println("Your grade is A");
		}else if(g>=80 && g<90) {
			System.out.println("Your grade is B");
		}else if(g>=70 && g<80) {
			System.out.println("Your grade is C");
		}else if(g>=60 && g<70) {
			System.out.println("Your grade is D");
		}else if(g<60) {
			System.out.println("Your grade is F");
		}else {
			System.out.println("Your grade is incorrect");
		}
		
	}
	
}
