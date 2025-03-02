package exam01;

import java.util.Scanner;

public class Main409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA409 遞迴字串移除
		//(1) 請使用遞迴撰寫一個類別方法，此方法能夠將一個字串內的某個字元移除。
		//(2) 程式執行時，顯示【Input a string: 】要求輸入字串。
		//(3) 輸入完畢，顯示【Input a character: 】要求輸入「欲移除」的字元。
		//(4) 連續執行兩次，顯示如執行結果參考畫面，將字元從字串中移除。
		//-------------------------------------------------------------------------------
		// Input a string: java se8
		// Input a character: a
		// jv se8
		// Input a string: computer
		// Input a character: p
		// comuter
		
		Scanner s = new Scanner(System.in);
		//System.out.print("Input a string: ");
		
		String inStr = s.next("Input a string: ");
		String rmStr = s.next("Input a character:  ");
		
		StrClass sr = new StrClass();
		
		System.out.println(sr.strRm(inStr, rmStr));		
		
	}
	
	static class StrClass {
		
		String  strRm(String inStr, String rmStr) {
			
			String tgtStr = inStr.substring(0, 1);
			String nextStr	 = "";
			String result = "";
			
			if( tgtStr == "" ) {
				return "";
			}else {
				
				if( tgtStr.equals(rmStr) ) {
					result = result;
				}else {
					result = result + tgtStr;
					nextStr = inStr.substring(1);
				}				
				return strRm(nextStr, rmStr);
			}
		}
		
	}

}
