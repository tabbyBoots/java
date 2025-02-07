package topic02;

import java.util.Scanner;

public class JPA202 {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA202 比較大小
		//(1) 請設計一程式，使用者可輸入兩個整數，並且比較兩個整數大小。
		//(2) 程式執行時，畫面顯示【Input:】，請使用者輸入兩組整數，各組整數分別輸入兩個數字，數字中間以空格鍵間隔。
		//(3) 重複執行兩次，一輸入的兩個整數比較大小，顯示如執行結果參考畫面。
		//------------------------------------------------------------------------------------------------
		// Input:
		// 50 88
		// 88 is larger than 50
		// Input:
		// 33 45
		// 45 is larger than 33
		//------------------------------------------------------------------------------------------------
		
		numCompare();
		numCompare();
	}
	
	public static void numCompare() {
		System.out.println("Input:");
		int number;
		int a = s.nextInt(), b = s.nextInt();
		
		if(a>b) {
			System.out.printf("%d is larger than %d\n", a, b);
		}else {
			System.out.printf("%d is larger than %d\n", b, a);
		}
	}
}
