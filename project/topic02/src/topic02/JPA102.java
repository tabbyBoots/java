package topic02;

import java.util.Scanner;

public class JPA102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JPA102 單位換算
		//(1) 程式執行時，畫面顯示【Please input:】，於後方由鍵盤輸入數字後，輸出轉換數值 (由公斤轉換成磅數)，
//		    顯示如執行結果參考畫面 (2)。
		//(2) 單位轉換公式為：1 公斤等於 2.20462 磅。
		
		//(1) 程式執行時，畫面顯示【Please input:】。 ex: 15
		//(2) 於後方輸入數字，進行單位轉換，顯示 kg = ponds。 ex: 15.000000 kg = 33.069300 ponds
		
		System.out.print("Please input:");
		
		Scanner s = new Scanner(System.in);
		
		double orgWeightInKG = s.nextInt();
		double tgtWeightInPD = orgWeightInKG * 2.20462 ;
		
		System.out.printf("%.6f kg = %.6f ponds", orgWeightInKG,tgtWeightInPD);
		

	}

}
