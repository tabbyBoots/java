package topic01;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amount = 0;
		// 建構一個 CalculateTax 物件，ct
		CalculateTax ct = new CalculateTax ();
		// 使用 ct 中的 rtnTax 方法，需傳入月薪
		amount = ct.rtnTax(55000);
		System.out.println(" 稅額是：" + amount);
		
	}

}

class CalculateTax
{
	
	private double rate = 0.06;
	
	public double rtnTax(int salary){
		
		double amount = 0; // 宣告一個變數，稅額用
		
		amount = salary * 12 * rate; // 計算稅額
		
		return amount; // 傳回計算的稅額
	}
	
	
}
