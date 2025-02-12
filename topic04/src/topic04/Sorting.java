package topic04;

import java.util.Arrays;

public class Sorting {
	
	int[] data= {};
	int length = 0;

	public Sorting( int[] data) {
		this.data = data;
		this.length = data.length;
	}
	
	int[] bubble() {		
		
		int numSwap=0, ctr=0, len= data.length;
		
		for(int i = 0; i < len -1; i++) {
			for(int j = 0; j < len-1-i; j++) {
				if( data[j] < data[j+1] ) {
					numSwap = data[j];
					data[j] = data[j+1];
					data[j+1] = numSwap;
				}
				ctr++;
				System.out.print("srt ary: " + i +"  "+ j + "  [" + data[0] + ", " + data[1] + ", " + data[2] + ", "+ data[3]+", "+ data[4]+"]  step: "+ (ctr) + "\n");
			}
		}
		System.out.println("\nTotal steps: " + ctr);
		
		return data;
	}
	
	int [] inserttion(){
		int n = data.length;
		int key = 0, j = 0;

		for(int i=1; i<n; i++){
			key = data[i];
			j = i-1;

			while( j>= 0 && data[j] < key ){
				data[j+1] = data[j];
				j = j-1;
			}
			data[j+1] = key;
		}
		return data;
	}
}
