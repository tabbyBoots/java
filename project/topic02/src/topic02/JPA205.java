package topic02;

import java.util.Scanner;

public class JPA205 {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JPA205 倍數判斷
		//(1) 請設計一程式，能判斷使用者所輸入的整數，是否為 2、3、6 的倍數。
		//(2) 程式執行時，畫面顯示【Enter an integer:】，請使用者輸入一個整數。
		//(3) 若輸入的整數是 2、3、6 的倍數，請輸出此整數是 2、3、6 哪些整數的倍數。
//		    若輸入的整數都不是 2、3、6 的倍數，請輸出【xx 不是 2、3、6 的倍數】，將使用者輸入的整數代入 xx 內。
		//(4) 重複執行四次，顯示如執行結果參考畫面。
		//---------------------------------------------------------------------------------------------
		// Enter an integer:
		// 30
		// 30是2、3、6的倍數
		// Enter an integer:
		// 2
		// 2是2的倍數
		// Enter an integer:
		// 9
		// 9是3的倍數
		// Enter an integer:
		// 77
		// 77不是2、3、6的倍數
		for(int i =0;i<4;i++) {
			cmnMul236();
		}
	}
	
	public static void cmnMul236() {
		System.out.println("Enter an integer:");
		int x = s.nextInt();
		
		if(x % 6 == 0) {
			System.out.printf("%d 是2、3、6的倍數%n", x);
			
		}else if(x % 2 == 0) {
			System.out.printf("%d 是2的倍數%n", x);
		}else if(x % 3 == 0) {
			System.out.printf("%d 是3的倍數%n", x);
		}else {
			System.out.printf("%d 不是2、3、6的倍數%n", x);
		}
			
	}

}
