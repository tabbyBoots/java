package topic02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Age:\t");
		int age = s.nextInt();
		
		
		
		if (age>18) {
			System.out.println("成年");
			
			System.out.println("Grade:\t");
			int grade = s.nextInt();
			
			if(grade>=95) {
				System.out.println("成績：A: "+grade+", 很好");
			}else if(grade>=85) {
				System.out.println("成績：B: "+grade+", 很好");
			}else if(grade>=65) {
				System.out.println("成績：C: "+grade+", 很好");
			}else {
				System.out.println("成績：D: "+grade+", 完蛋20");
			}
			
		}else {
			System.out.println("程式結束");
		}
		
		System.out.println("程式結束");
	}

}
