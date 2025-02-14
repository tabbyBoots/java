package exam01;

import java.util.Scanner;

public class main310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA310 迴圈正偶數相加
		//(1) 程式執行時，畫面顯示【請輸入 n 的值(n > 0，且為偶數)：】，請使用者輸入一個正偶數。
		//(2) 試利用 do-while，計算 2 + 4 + 6 + … + n 的總和，其中 n 為一由鍵盤輸入的正偶數，
//		    若輸入的不是正偶數，則程式會要求使用者再次輸入，直到輸入的數是正偶數為止。
		//(3) 計算 2 + 4 + 6 + … + n 的總和，顯示如執行結果參考畫面 (2)。
		//------------------------------------------------------------------------------------
		// 請輸入 n 的值(n > 0，且為偶數)：3
		// 請輸入 n 的值(n > 0，且為偶數)：-2
		// 請輸入 n 的值(n > 0，且為偶數)：10
		// 2+4+...+10=30
		oddSum();
	}
	
	static void oddSum() {
		Scanner sc = new Scanner(System.in);
		
		int total = 0, ctr =0, n =0;
		
		do {
			System.out.print("Input an odd number:");
			n = sc.nextInt();
			if( n % 2 == 0) {
				total += n;
			}else {
				System.out.println("NOT an odd number.");
			}
			ctr++;
		}while( n % 2 == 0 );
		System.out.printf("2 + 4 + 6 + ... + %d=%d", ctr-1, total);
	}

}
