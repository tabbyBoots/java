package topic02;

import java.util.Scanner;

public class JPA206 {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA206 及格分數
		//(1) 請撰寫一個能輸入國文、英文、數學三科分數的程式。
		//(2) 程式執行時，如執行結果參考畫面 (1)，畫面顯示【Input Chinese score:】，
//		    請使用者輸入國文分數，再分別依序要求輸入英文、數學的分數。
		//(3) 將此三個分數分別存入變數之中，再判斷是否有任何一科不及格，如果任何一科不及格，
//		    則輸出該科不及格，分別顯示【科目 + failed.】；如果全部都及格，則輸出全部通關，顯示【All Pass.】。
		//(4) 重複執行四次，顯示如執行結果參考畫面 (2)。
		//-------------------------------------------------------------------------------------------
		// Input Chinese score:80
		// Input English score:98
		// Input Math score:55
		// Math failed.
		// Input Chinese score:10
		// Input English score:80
		// Input Math score:70
		// Chinese failed.
		// Input Chinese score:100
		// Input English score:100
		// Input Math score:100
		// All pass.
		// Input Chinese score:10
		// Input English score:10
		// Input Math score:10
		// Chinese failed.
		// English failed.
		// Math failed.
		for(int i=0; i<4; i++) {
			dispGrade();
		}	
	}
	
	public static void dispGrade() {
		System.out.println("Input Chinese score:");
		int ch = s.nextInt();
		System.out.println("Input English score:");
		int en = s.nextInt();
		System.out.println("Input Math score:");
		int ma = s.nextInt();
		
		if(ch < 60) {
			System.out.println("Chinese failed.");
		}
		if(en < 60) {
			System.out.println("English failed.");
		}
		if(ma < 60) {
			System.out.println("Math failed.");
		}
		if(ch >= 60 && en >= 60 && ma >= 60) {
			System.out.println("All pass.");			
		}
	}

}
