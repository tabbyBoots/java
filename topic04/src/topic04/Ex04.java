package topic04;

import java.util.Arrays;


public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] source = {55, 66 , 80, 117, 6};
		String[] srcFruit = {"apple", "tomato", "grape", "orange", "melon"};
		
		Ex04 ss = new Ex04();
		
		Searching sing = new Searching();
		
		System.out.println(Arrays.toString(source) );
		System.out.println("Max: " + ss.max(source) );
		System.out.println("Min: " + min(source) );//有宣告static所以不用實體化
		System.out.println();
		
		System.out.println("Result: " + sing.isExist( "watermelon", srcFruit ) );
	}
	
	//回傳陣列最大數字
	//方法前面沒有 static 字樣，表示使用前必須重新分配記憶體 (要用 new )
	int max( int[] source ) {		
		
		//Interger是整數(int)的包裝類別(wrapper class)，可以使用其static資料跟方法
		//int result = Integer.MIN_VALUE;
		
		int result = source[0];
		
		for( int tmp : source) {
			if( tmp > result ) {
				result = tmp;
			}	
		}		
		return result;
	}
	
	static int min( int[] source ) {
		int result = source[0];
		
		for( int tmp : source) {
			if( tmp < result ) {
				result = tmp;
			}	
		}	
		return result;
	}

}
