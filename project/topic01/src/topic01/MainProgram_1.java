package topic01;

public class MainProgram_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amount=0;
		
		MainProgram_1 mp=	new MainProgram_1();
		amount=	mp.rtnTax(12000);
		System.out.println("Tax:"+amount);
		
		
	}
	
	public double rtnTax(int salary) 
	{
		double rate=0.06;
		double amount=0;
		
		amount=salary*12*rate;
		
		return amount;
	}

}
