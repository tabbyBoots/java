package exam01;

import java.util.Scanner;

public class main301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA301 整數連加
		//(1) 請使用 for loop 撰寫程式，輸入一個正整數 N，計算 1 + 2 + 3 + … + N 的結果。
		//(2) 程式執行時，顯示【Input:】要求輸入一個正整數，輸入完畢，於下方計算 1 + … + N 的總和。
		//(3) 顯示如執行結果參考畫面。
		//-----------------------------------------------------------------------------------
		// Input:
		// 88
		// 1 + ... + 88 = 3916
		Scanner sc = new Scanner(System.in);
		int result = 0, range = 1;
		
		System.out.println("Input:");		
		range = sc.nextInt();
		
		for(int i=1; i <= range; i++) {
			result += i;
		}
		//System.out.println(result);
		System.out.println("1 + ... + " + range + " = " + result);
	}
}
