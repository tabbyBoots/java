package exam01;

import java.util.Scanner;

public class main401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JPA401 遞迴階乘計算
		// (1) 請寫一個程式持續輸入一個數 n，使用遞迴計算 n 的階乘，直到 n 輸入的數值是 999 為止。
		// (2) 程式執行時，顯示【Input n (0 <= n <= 16):】要求輸入數值。
		// (3) 顯示如執行結果參考畫面。
		// --------------------------------------------------------------------------------------
		// Input n (0 <= n <= 16):6
		// 6 的階層 = 720
		// Input n (0 <= n <= 16):10
		// 10 的階層 = 3628800
		// Input n (0 <= n <= 16):999
		Scanner s = new Scanner(System.in);
		int n = 0;
		do {
			n = s.nextInt();
			calcFacotrial_void(n);
		} while (n != 999);
	}
	
	static void calcFacotrial_void(int n) {
	
		if (n == 0 || n == 1) {
			System.out.printf("%d的階層=%d\n", n, 1);
		} else if (n > 1 && n <= 16) {
			System.out.printf("%d的階層=%d\n", n, calcFacotrial_int(n));
		} else {
			System.out.println("Out of range");
		}
	}
	
	static int calcFacotrial_int(int n) {
		if(n ==0) {return 1;}
		return n * calcFacotrial_int(n - 1);
	}
}
