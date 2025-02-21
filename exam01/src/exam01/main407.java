package exam01;

import java.util.Scanner;

public class main407 {

	public static void main(String[] args) {
		//JPA407 尾端遞迴計算總和
		//(1) 請使用尾端遞迴及迴圈撰寫一個類別方法，此方法能夠計算一個數字字串內所有數字的和。
		//(2) 程式執行時，顯示【Input a string of numbers: 】要求輸入數字字串。
		//(3) 連續執行兩次，如執行結果參考畫面，列出以「尾端遞迴」及「迴圈」計算後之數字總和。
		//---------------------------------------------------------------------------------
		// Input a string of numbers: 1234
		// 尾端遞迴：10
		// 迴圈：10
		// Input a string of numbers: 3456
		// 尾端遞迴：18
		// 迴圈：18
		Scanner s = new Scanner(System.in);
		String n = "";
		int sum =0;
		
		System.out.print("Input a string of numbers: ");
		n = s.nextLine();		
		System.out.printf("尾端遞迴：%d\n", fac407(n, sum));
		System.out.printf("迴圈：%d\n", loop407(n, sum));
		
		System.out.print("Input a string of numbers: ");
		n = s.nextLine();
		System.out.printf("尾端遞迴：%d\n", fac407(n, sum));
		System.out.printf("迴圈：%d\n", loop407(n, sum));
		
	}
	
	static int fac407(String n, int sum) {
		
		if(n.equals("")) {
			return sum;
		}else {
			return fac407( n.substring(1), sum + Integer.parseInt( n.substring(0, 1) ));
		}		
	}
	
	static int loop407(String n, int sum) {

		String curStr = "";
		while(!n.equals("")) {
			sum = sum + Integer.parseInt( n.substring(0, 1) );
			curStr = n.substring(1);
		}
		return sum;			
	}
	
	
	
	
	
	
	
	

//    public static int sumLoop(String a,int b)
//    {
//        while(!a.equals(""))
//        {
//            b=b+Integer.parseInt(a.substring(0,1));
//            a=a.substring(1);
//        }
//        return b;
//    }
}
