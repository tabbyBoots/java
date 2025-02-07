package topic02;

import java.util.Scanner;

public class JPA201 {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//JPA201 分數篩選
		//(1) 請設計一程式，此程式能判斷輸入分數是否及格，程式執行時，顯示【Please enter score:】要求輸入分數。
		//(2) 如果使用者輸入的分數大於等於 60，則輸出【You pass】。
		//(3) 如果使用者的分數小於 60，則不做任何處理。
		//(4) 最後由電腦輸出【End】代表程式結束。
		//(5) 重複執行兩次，顯示如執行結果參考畫面。
		//-----------------------------------------------------------------------------------------------
		// Please enter score:
		// 98
		// You pass
		// End
		// Please enter score:
		// 45
		// End 
		//-----------------------------------------------------------------------------------------------
		ScoreVerify();
		ScoreVerify();
	}
	
	public static void ScoreVerify() {
		
		System.out.println("Please enter score:");
		double score = s.nextDouble();
		
		if (score >= 60)
			System.out.println("You pass");
		System.out.println("End");
	}
}
