package topic04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_array2_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s = new Scanner(System.in);
		
//		int [] score = new int[6];
		int[] score = {60, 70, 80, 90, 100};
		
		//這是共用陣列記憶體位置，修改元素的話，2個陣列都會被改，要注意
		int[] scoreB = score;
		//這是複製陣列記憶體位置，修改元素的話，原陣列不會被影響
		int[] scoreC = score.clone();
		
		int totScore = 0, aveScore = 0, numOfStudent=0;		
		numOfStudent = score.length;		
//		System.out.print("請輸入成績 > ");
		
		for(int i=0; i < numOfStudent; i++) {
//			score[i]=s.nextInt();
			totScore += score[i];
		}
		
		
//		for(int i=0; i < numOfStudent; i++) {
//			System.out.printf("第%d位學生的成績是：%d%n", i+1, score[i]);
//		}
		int i = 0;
		System.out.println();
		
		scoreB[3] = 50;
		scoreC[2] = 25;
		
		//使用 Arrays.toString()函數
		System.out.println( "A班：" + Arrays.toString(score) );
		System.out.println( "B班：" + Arrays.toString(scoreB) );
		System.out.println( "C班：" + Arrays.toString(scoreC) );
		System.out.println();
		//使用 foreach 迴圈來go through 陣列元素
		for( int tmp: score) {
			System.out.printf("第%d位學生的成績是：%d%n", i+1, score[i]);
			i++;
		}
		
		aveScore = totScore / numOfStudent;		
		
		System.out.println("\n平均成績：" + aveScore);
		System.out.println("總成績：" + totScore );
		
	}

}
