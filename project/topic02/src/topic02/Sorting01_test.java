package topic02;

public class Sorting01_test {

	void bleSrt(int num1, int num2, int num3, int num4, int num5) {

		int ary[] = { num1, num2, num3, num4, num5 };
		int len=ary.length, numSwap=0, ctr=0;
		
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len -i - 1; j++) {
				if (ary[j] < ary[j + 1]) {
					numSwap = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = numSwap;
				}
				ctr++;
				System.out.print("srt ary:\t" + i +"\t"+ j + "\t" + ary[0] + "\t" + ary[1] + "\t" + ary[2] + "\t"+ ary[3]+"\t"+ ary[4]+"\n");
			}
		}
		System.out.println();
		System.out.println("total steps:\t\t" + ctr);		
		System.out.print("org ary:\t\t\t" + num1 + "\t" + num2 + "\t" + num3 + "\t"+ num4 + "\t"+ num5 + "\n");
		System.out.print("srted ary: \t\t" + ary[0] + "\t" + ary[1] + "\t" + ary[2] + "\t"+ ary[3] + "\t"+ ary[4] + "\n");

	}
}
