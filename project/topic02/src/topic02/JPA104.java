package topic02;
import java.util.Scanner;

public class JPA104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//package tqc_ex;
		//import java.util.Scanner;
		//JPA104 距離計算
		//(1) Math 套件 (package) 內有許多數學上常用的函數。
		//(2) 請使用 Math.pow 及 Math.sqrt 撰寫程式，顯示【輸入第1組的x和y座標：】，提示使用者首先輸入第一組座標 (x1, y1)
//		    ，x 與 y 座標的輸入以一空隔鍵分隔，其資料型態皆為正整數。
		//(3) 要求輸入第2組座標 (x2, y2)。
		//(4) 兩組座標輸入完畢，輸出兩組座標之間的距離，顯示如執行結果參考畫面 (3)。
		//-----------------------------------------------------------------------------------------------------------
		//(1) 提示使用者首先輸入第一組座標 (x1, y1)。
//		    輸入第1組的x和y座標：     ex: 1 5
		//(2) 要求輸入第二組座標 (x2, y2)。
//		    輸入第2組的x和y座標：     ex: 10 22
		//(3) 兩組座標輸入完畢，輸出兩組座標之間的距離。
//		    ex: 介於(1.00,5.00)和(10.00,22.00)之間的距離是19.25
		
		System.out.print("輸入第1組的x和y座標:\t");
		
		Scanner s = new Scanner(System.in);
		
		double p1x=0, p1y=0, p2x=0, p2y=0, distance=0;
		p1x = s.nextInt();
		p1y = s.nextInt();
		
		System.out.print("輸入第2組的x和y座標:\t");
		
		p2x = s.nextInt();
		p2y = s.nextInt();
		
		distance = Math.sqrt(Math.pow(p1x - p2x, 2) + Math.pow(p1y - p2y,2));
	
		System.out.printf("介於 ( %.2f,%.2f ) 和 ( %.2f,%.2f ) 之間的距離是 %.2f。\n", p1x,p1y,p2x,p2y,distance);
	}

}
