package topic04;

import java.util.Arrays;

public class Ex06_bubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {5 , 10, 33, 20, 2};
		
		System.out.println("Org Ary: i  j\t" + Arrays.toString(data) +"\n");
		
		Ex06_bubbleSorting srt = new Ex06_bubbleSorting();
		srt.sort(data);

		
		System.out.println("Srt Ary: i  j\t" + Arrays.toString(data) );
		
	}
	
	int[] sort(int[] data) {

		int tmp = 0, ctr = 0;
		for(int i=0; i < data.length-1; i++) {
			for(int j=0; j < data.length-1-i; j++) {
				if( data[j] < data[j+1] ) {
					tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
				System.out.print("srt ary: " + i +"  "+ j + "  \t[" + data[0] + ", " + data[1] + ", " + data[2] + ", "+ data[3]+", "+ data[4]+"]  step: "+ (ctr+1) + "\n");
				ctr++;
			}
		}

		System.out.println("\nTotal steps: " + ctr);
		
		return data;
	}
}
