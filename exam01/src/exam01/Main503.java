package exam01;

public class Main503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JPA503 矩陣之和
		//(1) 試撰寫一個函數，此函數可用來計算矩陣 A 與 B 的和，使「矩陣之和」程式正常執行。
//		    int A[][] = {{1, 2, 3}, {4, 5, 6}}
//		    int B[][] = {{7, 8, 9}, {10, 11, 12}}
		//(2) 計算矩陣 A 與 B 的和，並把相加後的結果放在矩陣 C 裡。
		//(3) 顯示如執行結果參考畫面。
		//--------------------------------------------------------------------------------------
		// 陣列A的內容為(3x3)：
		// 01 02 03 	07 08 09 
		// 04 05 06 	10 11 12 
		//
		// 陣列B的內容為(3x3)：
		// 07 08 09 
		// 10 11 12 
		//
		// 陣列A+B=C，陣列C的內容為(3x3)：
		// 08 10 12 
		// 14 16 18
		
		int A[][] = {{1, 2, 3}, {4, 5, 6}};
	    int B[][] = {{7, 8, 9}, {10, 11, 12}};
	    
	    System.out.printf("陣列A的內容為(3x3)：\n");
	    dispMatrix(A);
	    System.out.println();
	    System.out.printf("\n陣列B的內容為(3x3)：\n");
	    dispMatrix(B);
	    System.out.println();
	    System.out.printf("\n陣列A+B=C，陣列C的內容為(3x3)：\n");
	    dispMatrix( calcMatrix(A, B) );
	}
	
	static int[][] calcMatrix(int A[][], int B[][]){
		int[][] C = new int[2][3];
		for(int i =0; i < 2; i++) {
			for(int j =0; j < 3; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		return C;
	}
	static void dispMatrix(int C[][]) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%02d ", C[i][j]);
			}
			System.out.printf("%n");
		}
	}
}
