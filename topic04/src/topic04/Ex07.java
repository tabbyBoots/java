package topic04;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Searching search = new Searching();	
		
		String[] data = {"apple", "tomato", "grape", "orange", "melon"};
		String targetStr = "orange";			
		int[] dataNum = {50, 85, 125, 63, 24, 75, 10};
		
		//找陣列最大數值
		System.out.println( Arrays.toString(dataNum) );
		System.out.println( "Max: \t" +search.max(dataNum) );
		
		//找陣列最小數值
		System.out.println( "Min: \t" +search.min(dataNum) );
		System.out.println();
		
		//查詢字串是否在陣列中
		System.out.println( Arrays.toString(data) );
		System.out.println("\nYou are looking for > [ " + targetStr + " ]");	
		
		Boolean result = search.isExist( targetStr, data);
		
		if( result ) {
			System.out.println( "[ "+ targetStr + " ]" +  " is in the array.");
		}else {
			System.out.println( "[ "+ targetStr + " ]" + " is not in the array.");
		}		
	}
}
