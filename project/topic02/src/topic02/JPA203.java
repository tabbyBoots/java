package topic02;

import java.util.Scanner;

public class JPA203 {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA203 判斷奇偶數
		//(1)請設計一程式，使用者可輸入一個整數，判斷此整數為奇數或偶數。
		//(2)程式執行時，畫面顯示【Input an integer:】，請使用者輸入一個整數。
		//(3)重複執行兩次，如執行結果參考畫面。若為奇數，顯示【The number is odd.】：若為偶數，則顯示【The number is even.】。
		//-----------------------------------------------------------------------------------------------------------
		// Input an integer:
		// 7
		// The number is odd.
		// Input an integer:
		// 28
		// The number is even.
		//-----------------------------------------------------------------------------------------------------------

		oddOrEven();
		oddOrEven();

	}
	
	public static void oddOrEven() {
		System.out.println("Input an integer:");
		int x = s.nextInt();
		if( x % 2 == 0) {
			System.out.printf("The number is even.", x);
		}else {
			System.out.printf("The number is odd.", x);
		}
		System.out.println();
	}

}
