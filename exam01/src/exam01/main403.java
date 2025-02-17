package exam01;

import java.util.Scanner;

public class main403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JPA403 尾端遞迴次方計算
		// (1) 請寫一個程式持續輸入兩個數 m、n，使用尾端遞迴及迴圈計算 m 的 n 次方，直到 m 輸入的數值是 999 為止。
		// (2) 程式執行時，顯示【Input m:】要求輸入m；輸入完畢。於下行顯示【Input n:】要求輸入 n。
		// (3) 顯示如執行結果參考畫面。
		// ---------------------------------------------------------------------------------
		// Input m:3
		// Input n:6
		// Ans(尾端遞迴) = 729
		// Ans(迴圈) = 729
		// Input m:12
		// Input n:3
		// Ans(尾端遞迴) = 1728
		// Ans(迴圈) = 1728
		// Input m:999
		Scanner s = new Scanner(System.in);
		int m = 1, n = 1, result = 1;

		while (m != 999) {
			System.out.print("Input m: ");
			m = s.nextInt();
			if(m!=999) {
				System.out.print("Input n: ");
				n = s.nextInt();
				System.out.printf("Ans(尾端遞迴)=%d\n", backFactorial(m, n, result));
				System.out.printf("Ans(迴圈)=%d\n", loop(m, n));	
			}
							
		};

	}
	
	static int backFactorial(int m, int n, int result) {
		if(n==1) {return m * result;}
		return backFactorial(m, n-1, m * result );
	}
	
	static int loop(int m, int n) {
		int result = 1;
		while(n>0) {
			result *= m;
			n--;
		}
		return result;
	}
	
}
