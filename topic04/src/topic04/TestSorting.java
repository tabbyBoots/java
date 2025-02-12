package topic04;

import java.util.Arrays;

public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = { 5, 10, 33, 20, 2 };

		System.out.println("Org Ary: i  j\t" + Arrays.toString(data) + "\n");
		Sorting srt = new Sorting(data);
		System.out.println("Srt Ary: i  j\t" + Arrays.toString(srt.insertion()));
//		System.out.println("Srt Ary: i  j\t" + Arrays.toString(srt.bubble()));
	}
}
