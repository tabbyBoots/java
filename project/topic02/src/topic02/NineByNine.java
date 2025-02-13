package topic02;

public class NineByNine {

	
	void disp9By9() {
		
		System.out.println("using For-loop\n");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+"x"+j+"="+i*j+"\t\t");
			}
			System.out.println();
		}
		
		System.out.println("\nusing while-loop\n");
		
		int m=1,n=1;
		while(m<=9) {
			n=1;
			while(n<=9) {
				System.out.print(m+"x"+n+"="+m*n+"\t\t");
				n++;				
			}
			System.out.println();
			m++;
		}
		
		System.out.println("\nTEST format\n");
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%dx%d=%d\t\t",i,j,i*j);
			}
			System.out.println();
		}
		
		
		
	}
	
}
