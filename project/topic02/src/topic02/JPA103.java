package topic02;

import java.util.Scanner;

public class JPA103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//JPA103 計算平均值
		//(1) 程式執行時，畫面顯示【Please input:】，於下方由鍵盤輸入 3 個整數，各整數中間以空隔鍵間隔，
//		    並分別存入三個整數變數。
		//(2) 計算這三個整數的平均值，平均值請取到小數第二位。
		//(3) 輸出平均值，顯示如執行結果參考畫面。
		//------------------------------------------------------------------------------------------
//		    Please input:     ex: 3580 26400 13588
//		    Average:          ex: 14522.67
			
		System.out.println("Please input:");
		
		Scanner s= new Scanner(System.in);
		
		double a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), average=0, sum=0;
		
		sum = a+b+c;
		
		average = sum/3;
		
		System.out.println("\t\t\t"+ (int)a+" "+(int)b+" "+ (int)c );
		System.out.printf("Average:\t %.2f", average);

	}

}
