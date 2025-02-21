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
		
		//calcStr();
		//calcStr();
		Scanner s = new Scanner(System.in);		
		String str = "";
		System.out.print("Input a string: ");
		str = s.nextLine();
		System.out.printf("%s has %d As%n", str, calcStr2(str) );
		
		System.out.print("Input a string: ");
		str = s.nextLine();
		System.out.printf("%s has %d As%n", str, calcStr2(str) );
		
//		System.out.println("QQ:substring(1) " + str.substring(1));
//		System.out.println("QQ:substring(0,1) " + str.substring(0,1));
	}
	
	static void calcStr() { //用迴圈計算
		Scanner s = new Scanner(System.in);
		
		String str = "";		
		char c =' ';
		int index =0, ctr=0;
		
		System.out.print("Input a string: ");
		str = s.nextLine();
		 	
		int len= str.length();
		for(index=0; index < len; index++) {
			c = str.charAt(index);
			if( c == 65 ) {ctr++;}
		}		
		System.out.printf("%s has %d As%n", str, ctr );		
	}
	
	static int calcStr2(String str) {//用遞迴計算
		if(str.equals("")) {
			return 0;
		}else if( str.substring(0, 1).equals("A") ) {
			return 1 + calcStr2(str.substring(1));
		}else {
			return calcStr2(str.substring(1));
		}
	}	
}
