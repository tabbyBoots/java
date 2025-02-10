package topic04;

public class Sorting {
	
	int[] data= {};
	int length = 0;
	
//	public Sorting() {}
//	
//	public Sorting( int[] data) {
//		this.data = data;
//		this.length = data.length;
//	}
	
	int[] bubble( int[] data) {		
		
		int tmp=0, ctr=0;
		for(int i = 0; i < data.length -1; i++) {
			tmp = 0;
			for(int j = 0; j < data.length-1-i; j++) {
				if( data[j] < data[j+1] ) {
					tmp = 	data[j];
					data[i] = data[j+1];
					data[j+1] = tmp;
				}
				System.out.print("srt ary: " + i +"  "+ j + "  [" + data[0] + ", " + data[1] + ", " + data[2] + ", "+ data[3]+", "+ data[4]+"]  step: "+ (ctr+1) + "\n");
				ctr++;
			}
		}
		System.out.println("\nTotal steps: " + ctr);
		//System.out.println(this.length);
		return data;
	}	
}
