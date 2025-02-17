package exam01;

import java.util.Scanner;

public class main406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA406 遞迴字串計算
		//(1) 請使用遞迴撰寫一個類別方法，可計算一個字串內有幾個 A，大小寫有所區別。
		//(2) 程式執行時，顯示【Input a string: 】要求輸入字串。
		//(3) 連續執行兩次，如執行結果參考畫面，顯示【輸入的字串 has X As】。
//		    將計算此字串內有幾個 A，代入 X 中。
		//-------------------------------------------------------------------------------------
		// Input a string: COMPUTER SKILLS FOUNDATION
		// COMPUTER SKILLS FOUNDATION has 1 As
		// Input a string: java
		// java has 0 As
		
		Scanner s = new Scanner(System.in);
		String str = "";
		str = s.next();
		System.out.print("Input a string: ");
		
	}
	
	static void calcStr(String str) {
		int index =0, ctr=0, len= str.length();	
		
		if( index < len ) {
			char c = str.charAt(index);
			if( c == 97 ) {ctr++;}
		}
		
	}
}
