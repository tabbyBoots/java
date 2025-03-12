package exam01;

public class Main504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(1) 費氏數 (Fibonacci sequence) 可使用於建築設計，費氏數列為 0、1、1、2、3、5、8、13、21、34、55、…，第一個數為 0，第二個為 1，其它的數為前面兩個數的和。
//
//		(2) 請用陣列方式寫出費氏數 0、1、1、2、3、5、8、13、21、34 的程式。
//
//		(3) 請事先宣告一個大小為 10 的整數陣列，將最前面兩個陣列指定費氏數的初始值，並利用初始值來計算其餘的費氏數。
//
//		(4) 以分行方式，顯示此費氏數的前 10 個數值。		
				
		int[] FibonacciAry = new int[10];
		FibonacciAry[0] = 0;
		FibonacciAry[1] = 1;
		
		for(int i =1; i < 9; i++) {
			FibonacciAry[i+1] = FibonacciAry[i] + FibonacciAry[i-1];
		}	
		for(int i=0; i < 10; i++) {
			System.out.println( FibonacciAry[i]);
		}
		
	}
}
