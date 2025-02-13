package topic04;

import java.util.Arrays;

public class Ex_06_2_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = { 5, 10, 33, 20, 2 };
		
		System.out.println("Org Ary: i  j  " + Arrays.toString(data));
		Sorting srt = new Sorting(data);
		System.out.println("Srt Ary: i  j\t" + Arrays.toString( srt.bubble() ));
	}

}
