package exam01;

import java.util.Scanner;

public class main304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA304 餐點費用
		//(1) 有五位朋友到知名美式餐廳慶生，此餐廳採點餐的計算方式。
		//(2) 程式執行時，如執行結果參考畫面 (1)，畫面顯示【Please enter meal dollars or enter -1 to stop:】，
//		    請使用者輸入第一道餐點費用，再分別依序要求輸入其他道餐點的費用。
		//(3) 若要停止執行程式計算，需輸入 -1 後停止程式計算，-1 不列入餐點計算的費用內。如執行結果參考畫面 (2)，
//		    輸出餐點數量、所有餐點的總費用及平均負擔費用，平均值取至小數第二位。
		//(4) 顯示如執行結果參考畫面。
		//-------------------------------------------------------------------------------------------------
		// Please enter meal dollars or enter -1 to stop: 180
		// Please enter meal dollars or enter -1 to stop: 120
		// Please enter meal dollars or enter -1 to stop: 99
		// Please enter meal dollars or enter -1 to stop: 399
		// Please enter meal dollars or enter -1 to stop: 150
		// Please enter meal dollars or enter -1 to stop: -1
		// 餐點總費用:948
		// 5 道餐點平均費用為: 189.60 
		Scanner sc = new Scanner(System.in);
		int n= 1, ctr=1, total=0;
		double avg = 0;
		while(n != -1) {
			System.out.print("Please enter meal dollars or enter -1 to stop: ");
			n = sc.nextInt();
			if(n != -1) {
				total += n;
				avg = ((double)total / (double)ctr);
				ctr++;
			}			
		}
		System.out.println("餐點總費用:" + total);
		System.out.printf("%d道餐點平均費用為:%.2f\n", ctr-1, avg);		
	}

}
