package exam01;

import java.util.Scanner;

public class main306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA306 迴圈次方計算
		//(1) 請設計一程式，持續輸入兩個數 m、n，m 與 n 中間以空隔鍵分隔，並以一個類別方法及 while loop
//		    計算 m 的 n 次方，直到輸入 m=999 為止。
		//(2) 顯示如執行結果參考畫面。
		//-------------------------------------------------------------------------------------------
		// Input:
		// 2 2
		// 4
		// Input:
		// 100 7
		// 276447232
		// Input:
		// 999 10
		Scanner sc = new Scanner(System.in);
		int m=1, n=1;
		double result =1;
		while(true) {
			System.out.println("Input:");
			m = sc.nextInt();
			if(m != 999) {
				n = sc.nextInt();
				result = Math.pow( (double)m, (double)n);
				System.out.println( (int)result );
			}else {
				System.out.println("END");
				break;
			}			
		}
	}
}
