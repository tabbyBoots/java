package topic02;

import java.util.Scanner;

public class MathSqrt {

	Scanner s = new Scanner(System.in);	

	void calcSqrt() {
			
		double result=0;
		
		System.out.println("請輸入數字>");
		int a2= s.nextInt();
		
		if(a2>0) {
			result = Math.sqrt(a2);
			System.out.println(a2+"的平方根是: \t"+ result);
		}else {
			System.out.println("數字要大於0喔。");
		}		
	}	
}
