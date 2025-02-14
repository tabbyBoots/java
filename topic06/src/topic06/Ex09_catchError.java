package topic06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09_catchError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int monthlySalary = -100;
		int annualSalary = -101;
		String monthlySalaryS = "-100";
		String annualSalaryS = "-101";
		
		System.out.print("Your salary? \n>");

//		try {
//			monthlySalary = sc.nextInt();
//			annualSalary = monthlySalary * 12;
//		}catch(InputMismatchException e){
//			System.out.print("Your input is incorrect. Please check again. \n>");
//		}
		
		try {
			monthlySalaryS = sc.next();
			annualSalary = (Integer.parseInt(monthlySalaryS) ) * 12;
		}catch(NumberFormatException e) {
			System.out.print("Your input is incorrect. Please check again. \n>");
		}					
		System.out.println(annualSalary);
		
//		try {
//			
//		}catch(){
//			
//		}
		
		
		
//		int i = 100, j = 0;
//		int result = 10;
//		int[] ary = new int [10];
//		
//		try {
//			result = i/j;
//		}catch(ArithmeticException e) {
//			System.out.println("Arithmetic! Oops~~");
//		}finally {
//			System.out.println("QA: " + result);
//		}
//		
//		try {
//			ary[result] = 6;
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBounds! Oops~~");
//		}finally {
//			System.out.println( "QB: " + result );
//		}
//		
//		try {
//			ary[result-1] = 100;
//		}catch(Exception e) {
//			System.out.println("Oops~~ Error unknown.");
//		}finally {
//			System.out.println("QC: " + result);
//		}
		
	}
}
