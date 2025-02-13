package topic06;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t01= new Time("JohnTime", 400, 2);
		FullTime t02= new FullTime("JohnFullTime", 400, 2);
		
		System.out.println("JohnTime\t" + t01.salary() );
		System.out.println("JohnFullTime\t" + t02.salary() );
		
		System.out.println("JohnTime's TAX: \t" + t01.calcTax() );
		System.out.println("JohnFullTime's TAX: \t" + t02.calcTax() );
		
		
		
	}

}
