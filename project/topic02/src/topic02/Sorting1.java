package topic02;

import java.util.Scanner;

public class Sorting1 {
	
	Scanner s = new Scanner(System.in);
	int num1, num2, num3=0;
	
	void bubbleSorting() {
		
		System.out.println("請輸入3個數字>");
		num1 = s.nextInt();
		num2 = s.nextInt();
		num3 = s.nextInt();
		System.out.println("");
		
		int ary[]= {num1,num2,num3};
		int length=ary.length, numSwap=0;
		
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
		System.out.print("\norg ary:\t\t\t"+ary[0]+ "\t"+ary[1]+"\t"+ary[2]+"\n");
		System.out.print("srted ary: \t\t"+ary[0]+ "\t"+ary[1]+"\t"+ary[2]+"\n");
	}
}
