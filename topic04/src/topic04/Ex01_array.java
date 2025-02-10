package topic04;

import java.util.Scanner;

public class Ex01_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int [] score = new int[6];
		int totScore = 0, aveScore = 0, numOfStudent=0;		
		numOfStudent = score.length;		
		System.out.print("請輸入成績 > ");
		
		for(int i=0; i < numOfStudent; i++) {
			score[i]=s.nextInt();
			totScore += score[i];
		}
				
		for(int i=0; i < numOfStudent; i++) {
			System.out.printf("第%d位學生的成績是：%d%n", i+1, score[i]);
		}
		
		aveScore = totScore / numOfStudent;
		
		System.out.println("平均成績：" + aveScore);
		System.out.println("總成績：" + totScore );		
	}

}
