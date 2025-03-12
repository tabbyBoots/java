package exam01;

import java.util.Scanner;

public class Main501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA501 陣列計算
		//(1) 請撰寫一個程式，由鍵盤輸入 10 個整數，並存放到一個陣列。
		//(2) 程式執行時，顯示如執行結果參考畫面 (1)，顯示【請輸入10個整數：】並顯示【第1個整數：】，要求輸入第 1 個整數。
		//(3) 依序要求輸入第 1 個至第 10 個整數，顯示如執行結果參考畫面 (2)。
		//(4) 判斷輸入 10 個整數後，計算陣列中大於 60 有幾個，這些大於 60 的數值總合及平均值，顯示如執行結果參考畫面 (3)。
		//----------------------------------------------------------------------------------------
		// 請輸入10個整數：
		// 第1個整數：88
		// 第2個整數：59
		// 第3個整數：66
		// 第4個整數：46
		// 第5個整數：92
		// 第6個整數：74
		// 第7個整數：52
		// 第8個整數：58
		// 第9個整數：69
		// 第10個整數：81
		// 陣列中大於60的有6個
		// 總合為470
		// 平均值為	78.33333333333333
		
		Scanner sc = new Scanner(System.in);
		int sum = 0, ctr = 0;
		double avg = 0;
		int[] numAry = new int[10];		
		
		System.out.println("請輸入10個整數：");
		for(int i =0; i<10; i++) {
			System.out.printf("請輸入第%d個整數：", i+1);
			numAry[i] = sc.nextInt();
		}
		for(int i =0; i < numAry.length; i++) {
			if( numAry[i] > 60 ) {				
				sum += numAry[i];
				ctr++;
			}			
		}
		
		avg = sum / (double) ctr;
		System.out.printf("陣列中大於60的有%d個%n", ctr);
		System.out.printf("總和為：%d%n", sum);
		System.out.print("平均值為" + avg);
		System.out.println();	
		
	}

}
