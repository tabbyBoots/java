package topic01;

import java.util.*;


public class ScannerIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, result;
		
		System.out.print("Please input num1.\t");
		num1=sc.nextInt();
		System.out.print("Please input num2.\t");
		num2=sc.nextInt();
		
		result=num1*num2;
		System.out.print("Final result:\t"+ result);
		
		sc.close();
		

	}

}
