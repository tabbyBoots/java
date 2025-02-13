package topic02;

import java.util.Scanner;

public class Pract0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		GradeTest gt = new GradeTest();
		
		gt.calcGrade(90);
		gt.calcGrade(75);
		gt.calcGrade(65);
		gt.calcGrade(105);
		gt.calcGrade(-10);

	}

}
