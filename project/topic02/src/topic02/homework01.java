package topic02;

import java.util.Scanner;

public class homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//列印出1~100 中，所有5 的倍數的數字，及其總和
		/*
		print5 p=new print5();
		p.print5(100);
		*/
		
		//輸入三個數值，依數字大小，由大至小列印
		/*
		Scanner s = new Scanner(System.in);
		
		System.out.println(">");
		int a1 = s.nextInt();
		System.out.println(">");
		int b1= s.nextInt();
		System.out.println(">");
		int c1= s.nextInt();
		
		Sorting1 srt = new Sorting1();
		srt.srt(a1,b1,c1);
		*/
		
		//利用「price」變數自定價格1
		/*
		  Price1000 p1000 = new Price1000();
		  System.out.println("Pay:\t" + (int)p1000.calcPay(1500)+"\n\n");
		 */
		
		//利用「price」變數自定價格2
		/*		
		  Price5000 p5000 = new Price5000();
		  System.out.println("Pay:\t" + (int)p5000.calcPay(2999)+"\n\n");
		*/		
		
		//求平方根的計算器
		/*
			Scanner s = new Scanner(System.in);
			System.out.println(">");
			int a2= s.nextInt();
			
			MathSqrt ma=new MathSqrt();
			System.out.println("MathSqrt result: \t"+ma.calcSqrt(a2)+"\n");
		 */
		
		//2-輸入三個數值，依數字大小，由大至小列印
				
		Scanner s = new Scanner(System.in);
		Sorting01_test srt01 = new Sorting01_test();
		srt01.bleSrt(10,20,30);
		
		System.out.print("\nEND");
	
	}

}
