package topic02;

import java.util.Scanner;

public class JPA204 {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA204 公倍數計算
		//(1) 請設計一程式，能判斷使用者所輸入的整數，是否能同時被 5、9 整除。
		//(2) 程式執行時，畫面顯示【Input:】，讓使用者輸入一個整數。
		//(3) 計算是否能同時被 5、9 整除。
		//(4) 若此數字為 5 與 9 的公倍數，則印出【Yes】，否則印出【No】。
		//(5) 重複執行兩次，顯示如執行結果參考畫面。
		//----------------------------------------------------------------------
		// Input:
		// 90
		// Yes
		// Input:
		// 70
		// No

		commonMuliple();
		commonMuliple();
	}
	
	public static void commonMuliple() {
		System.out.println("Input:");
		int x = s.nextInt();
		
		if( x % 5 == 0 && x % 9 == 0) {
			
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
	}
	
}
