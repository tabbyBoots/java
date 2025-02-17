package exam01;

import java.util.Scanner;

public class main402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA402 尾端遞迴階乘計算
		//(1) 尾端遞迴程式設計的特性是以另外傳入的參數來累計遞迴的答案。
		//(2) 請寫一個程式持續輸入一個數 n，請個別使用尾端遞迴程式設計及迴圈，計算 n 的階乘，直到 n 輸入的數值是 999 為止。
		//(3) 程式執行時，顯示【Input n (0 <= n <= 16):】要求輸入數值。
		//(4) 顯示如執行結果參考畫面。
		//-----------------------------------------------------------------------------------------
		// Input n (0 <= n <= 16):6
		// 6 的階層(尾端遞迴) = 720
		// 6 的階層(迴圈) = 720
		// Input n (0 <= n <= 16):8
		// 8 的階層(尾端遞迴) = 40320
		// 8 的階層(迴圈) = 40320
		// Input n (0 <= n <= 16):999
		Scanner s = new Scanner(System.in);
		int n =1, sum=1;
		System.out.print("Input n (0 <= n <= 16): ");
		
		do {
			n = s.nextInt();
			if( n>=0 && n<=16 ) {
				System.out.printf("%d的階層(尾端遞迴)=%d\n", n,calcFactorial(n,sum));
				System.out.printf("%d的階層(迴圈)=%d\n", n,loop(n));
			}else if(n<0 || n>16) {
				System.out.println("Out of range");
			}			
		}while( n != 999);
	}

	static int calcFactorial(int n, int sum) {
		if(n == 1 || n ==0) {return sum;}
		return calcFactorial(n-1, n*sum);
	}
	
	static int loop(int n) {
		int sum=1;
		for(int i=1; i<=n; i++) {
			sum*=i;
		}
		return sum;
	}
}
