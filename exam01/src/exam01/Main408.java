package exam01;

import java.util.Scanner;

public class Main408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA408 遞迴字串反向
		//(1) 請使用遞迴設計一個類別方法，此方法能夠將字串反向。
		//(2) 程式執行時，顯示【Input a string: 】要求輸入字串。
		//(3) 連續執行兩次，如執行結果參考畫面將字串反向印出。
		//----------------------------------------------------------------------------------------
		// Input a string: computer
		// retupmoc
		// Input a string: skills
		// slliks
		
		String orgStr = "";
		Scanner s = new Scanner(System.in);		
		System.out.print("Input a string: ");		
		orgStr = s.next();		
		
		StrRev sr = new StrRev();
		System.out.println(sr.strRev(orgStr));
		
		System.out.print("Input a string: ");		
		orgStr = s.next();	
		System.out.println(sr.strRev(orgStr));
	}
	
	static class StrRev{
		String orgStr = "";

		String strRev(String orgStr) {
			if( orgStr.equals("") ) {
				return "";
			}else {
				return strRev(orgStr.substring(1)) + orgStr.substring(0, 1);
			}
		}
	}
}

