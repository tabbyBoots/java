package exam01;

import java.util.Scanner;

public class main302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA302 巢狀迴圈
		//(1) 一個外迴圈包住一個或多個內迴圈稱之為巢狀迴圈，每次執行外迴圈時，都匯進入內迴圈，重複執行。
		//(2) 假設外迴圈重複了 3 次，而內迴圈重複了 2 次，則內迴圈內的敘述就會執行 3 * 2 次。
		//(3) 請完成 JPD03.java 檔案中的程式，讓 count 之值為 27。
		//(4) 顯示如執行結果參考畫面。
		//-------------------------------------------------------------------------------
		// count = 27
		Scanner sc = new Scanner(System.in);
		int i=1, j=1, count = 0;
		for(i=1; i <= 3; i++) {
			for(j = 1; j <= 2; j++) {
				count += 3*j;
			}
			
		}
		System.out.printf("count = %d\n", count);
	}
}
