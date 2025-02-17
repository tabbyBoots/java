package exam01;

import java.util.Scanner;

public class main405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JPA405 遞迴函數
		// (1) 請利用下面的公式，撰寫遞迴函數 sum2：
//		    a. sum2(1) = 2
//		    b. sum2(n) = sum2(n – 1) + 2 * n
		// (2) 程式執行時，顯示【Input the number n:】要求輸入 n (n >= 1)，並將 n 值代入函數中。
		// (3) 顯示如執行結果參考畫面。
		// ------------------------------------------------------------------------------------
		// Input the number n: 50
		// Ans: 2550
		Scanner s = new Scanner(System.in);
		int n = 1;

		System.out.print("Input the number n: ");
		n = s.nextInt();
		System.out.printf("Ans： %d\n", sum2(n));

	}

	static int sum2(int n) {
		if (n == 1) {
			return 2;
		}
		return sum2(n - 1) + 2 * n;
	}
}
