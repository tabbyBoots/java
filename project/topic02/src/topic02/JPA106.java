package topic02;

public class JPA106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JPA106 數學函數
		//(1) 有一數學函數 f(x) = 3(x ^ 3) + 2x – 1。
		//(2) 請撰寫一函數 f 用來傳回 f(x) 的值，並分別計算 f(-3.2)、f(-2.1)、f(0) 與 f(2.1)。
		//(3) 函數 f(x) 值取到小數第四位。
		//(4) 依此數學函數計算，分別輸出此四個計算值，顯示如執行結果參考畫面。
		//------------------------------------------------------------------------------------
//		    f(-3.2) = -105.7040
//		    f(-2.1) = -32.9830
//		    f(0) = -1.0000
//		    f(2.1) = 30.9830
		

		
		System.out.printf("%.4f", f(-3.2));
		
		static double F(double x) {
			
			double result = 0;
			result = 3 * (Math.pow(x, 3)) + 2*x - 1;	
			
			return result;
		}
		
	}
	
	
	
}
