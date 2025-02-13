package topic02;

public class JPA106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JPA106 數學函數
		// (1) 有一數學函數 f(x) = 3(x ^ 3) + 2x – 1。
		// (2) 請撰寫一函數 f 用來傳回 f(x) 的值，並分別計算 f(-3.2)、f(-2.1)、f(0) 與 f(2.1)。
		// (3) 函數 f(x) 值取到小數第四位。
		// (4) 依此數學函數計算，分別輸出此四個計算值，顯示如執行結果參考畫面。
		// ------------------------------------------------------------------------------------
//		    f(-3.2) = -105.7040
//		    f(-2.1) = -32.9830
//		    f(0) = -1.0000
//		    f(2.1) = 30.9830

		//在同一個class檔案 新增一個類別(CalcFn class) 來使用CalcFn方法
		
		System.out.printf("f(-3.2) = %.4f%n", CalcFn(-3.2));
		System.out.printf("f(-2.1) = %.4f%n", CalcFn(-2.1));
		System.out.printf("f(0) = %.4f%n", CalcFn(0));
		System.out.printf("f(2.1) = %.4f%n", CalcFn(2.1));
		
		System.out.println();
		
		//在原本的class檔案使用CalcFn方法，不用透過別的類別檔( CalcFn class)
				
				JPA106 Cfn = new JPA106();

				System.out.printf("f(-3.2) = %.4f%n", Cfn.CalcFn(-3.2));
				System.out.printf("f(-2.1) = %.4f%n", Cfn.CalcFn(-2.1));
				System.out.printf("f(0) = %.4f%n", Cfn.CalcFn(0));
				System.out.printf("f(2.1) = %.4f%n", Cfn.CalcFn(2.1));
	}
	
	//在原本的class檔案使用CalcFn方法，不用透過別的類別檔( CalcFn class)
	public static double CalcFn(double x) {

		return 3 * (Math.pow(x, 3)) + 2 * x - 1;
	}
}

//在同一個class檔案 新增一個類別(CalcFn class) 來使用CalcFn方法
class CalcFn {
	
	public static double CalcFn(double x) {
		
		return 3 * (Math.pow(x, 3)) + 2 * x - 1;
	}
}
