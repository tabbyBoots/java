package topic04;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Searching {
	
	//初始值
	private boolean result = false;
	private int tgtNum = 0, maxNum = 0, minNum= 0;
	private String tgtString = "";
	private char tgtChar =  ' ';
	private int[] tgtAry = {};
	
	//建構子
	public Searching() {}
	
	public Searching( int tgtNum, int[] tgtAry ) {
		this.tgtNum = tgtNum;
		this.tgtAry = tgtAry;
	}



	//功能1-找最大數值
	int max( int[] tgtAry) {
		for(int tmp : tgtAry) {
			if( maxNum < tmp ) {
				maxNum = tmp;
			}
		}
		return maxNum;
	}
	
	//功能2-找最小數值
		int min( int[] tgtAry) {
			minNum = tgtAry[0];
			for(int tmp : tgtAry) {
				if( minNum > tmp ) {
					minNum = tmp;
				}
			}
			return minNum;
		}
		
	//功能3-判斷字串是否在陣列中
	boolean isExist(String targetStr, String[] data) {
		
		String[] method = {"foreach", "Tree"};
		
		Scanner s = new Scanner(System.in);		
		
		System.out.printf("Available method >%n");
		
		for(int i =1;  i <=  method.length; i++) {
			System.out.printf("*%d.  %s%n", i, method[ i-1 ] );
		}
		
		System.out.print("Your choice is: > ");
		int selection = s.nextInt();
		
		if( selection == 1 ) {
			for(String tmp : data) {
				if( tmp == targetStr ) {
					result = true;
					break;
				}
				//System.out.println("Current > [ " + tmp +" ]\t");
			}			
		}else {
			System.out.println("Incorrect method. Please try again.");
		}		
		return result;
	}
	
}
