package topic02;

public class Sorting1 {
	
	void srt(int num1, int num2, int num3) {
		
		int length=3,  numSwap=0;
		int ary[]= {num1,num2,num3};
		
		
		for(int i=0;  i < length-1; i++) {
			for(int j=0; j<length-i-1; j++) {
				if( ary[j]< ary[j+1] ) {
					numSwap = ary[j];
					ary[j] = 		ary[j+1];
					ary[j+1] = numSwap;
				}
				System.out.print("srt ary: \t"+ i +"\t"+ j +"\t"+ary[0]+ "\t"+ary[1]+"\t"+ary[2]+"\n");	
			}
		}
		System.out.print("org ary:\t\t\t"+ary[0]+ "\t"+ary[1]+"\t"+ary[2]+"\n");
		System.out.print("srted ary: \t\t"+ary[0]+ "\t"+ary[1]+"\t"+ary[2]+"\n");
	}
}
