package topic02;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hw01 ex01 = new Hw01();
		
		ex01.test01();
		ex01.test02();
		ex01.test01_1("Bob",20000);
		System.out.println("TAX:\t"+ex01.test01_2(100));
		
		
		MathResult rlt = new MathResult();
		System.out.println("Result:\t"+rlt.calculateAbyB(5,6));
		
		System.out.println("Input two numbers.");
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		System.out.println("MathResult:\t"+ rlt.calculateAbyB(a,b));
		
		
		
		System.out.println("END");
	}
	
	void test01() {
		System.out.println("AA01");
	}
	
	void test02() {
		System.out.println("AA02");
	}
	
	void test01_1(String name, int salary) {
		System.out.println("NAME:\t"+name + "\tSalary:\t"+salary);
	}
	
	double test01_2(int diSalary) {
		//System.out.println("NAME:\t");
		return diSalary * 12 *0.06;
	}
}
