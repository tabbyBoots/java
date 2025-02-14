package exam01;

import java.util.Scanner;

public class main309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA309 迴圈倍數判斷
		//(1) 如下為 continue 之範例寫法。
		// class Ex {
//		     public static void main(String argv[]) throws IOException {
//		         for (int i=0; i<4; i++) {
//		             if(i == 2) {
//		             continue;
//		             }
//		             System.out.println("i = " + i);
//		         }
//		     }
		// }
		// Output：
//		     i = 0
//		     i = 1
//		     i = 3
		//(2) 請用 continue 設計一個程式，能夠計算 1 到「使用者輸入的數」之中，那些數是 3 的倍數或是 5 的倍數，而不是 7 的倍數。
		//(3) 將這些數值相加後輸出，顯示如執行結果參考畫面。
		
		System.out.println("Result:" + judge35x7());
	}
	
	static int judge35x7() {
		Scanner sc = new Scanner(System.in);
		int result = 0, num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			if( i % 3 == 0 || i % 5 == 0) {				
				if( i % 7 != 0) {
					result += i;
					System.out.println(i);
				}				
			}
		}		
		return result;
	}
}
