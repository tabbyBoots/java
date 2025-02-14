package exam01;

import java.util.Scanner;

public class main305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JPA305 迴圈階乘計算
		// (1) 請設計一程式計算 n 的階乘。
		// (2) n 為使用者任意輸入的整數值，n 值範圍介於 1 到 10 之間。
		// (3) 程式執行時，畫面顯示【Please enter one value:】，首先判斷 n 值是否介於 1 到 10 之間，
//		    若檢核通過，則輸出階乘計算後之數值；若沒有介於 1 到 10 之間，則顯示【Error, the value is out of range.】。
		// (4) 重複執行三次，顯示如執行結果參考畫面。
		// ----------------------------------------------------------------------------------------
		// Please enter value:
		// 0
		// Error, the value is out of range.
		// Please enter value:
		// 12
		// Error, the value is out of range.
		// Please enter value:
		// 6
		// 6!: 720		
		test();
		test();
		test();
		System.out.println("END");
	}

	static void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter one value:");
		int n = sc.nextInt(), result = 1;
		if (n >= 1 && n <= 10) {
			for (int j = 1; j <= n; j++) {
				result *= j;
			}
			System.out.printf("%d!:%d\n", n, result);
		} else {
			System.out.println("Error, the value is out of range.");
		}
	}
}
