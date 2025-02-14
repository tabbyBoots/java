package topic06;

public class Ex09 {

	public static void main(String[] args) {
		int num = 4, j=0;
		for (int i = num; i >= 1; i--) {
			recur(i);
			System.out.println();			
			
			if( i== 1) {
				printSpaces(num + 1 - i + j);
				System.out.println("1");				
			}else {
				printSpaces(num + 2 - i + j);
			}
			j++;
		}
		System.out.println();
		int fNum = 8;
		for(int i= 1; i<=fNum; i++ ) {
			if(i != fNum) {
				System.out.print( f(i) + ",");	
			}else {
				System.out.print(f(i));
			}
			
		}
		System.out.println();
		System.out.println(f(8));
	}

	// 費波那契數列（義大利語：Successione di Fibonacci）
	// 1 1 2 3 5 8 13 21
	
	static int f(int n) {
		if (n == 1 || n == 2) {			
			return 1;
		} else {
			return f(n - 1) + f(n - 2);
		}
	}	

	static void recur(int n) {

		if (n == 1) {
			System.out.print(n + " ");
			System.out.print(1 + " ");
		} else {
			System.out.print(n + " ");
			recur(n - 1);
			System.out.print(n + " ");
		}
	}
	static void printSpaces(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(" ");
		}
	}
}
