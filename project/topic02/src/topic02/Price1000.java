package topic02;

public class Price1000 {

	double calcPay(int price) {
		System.out.println("Price:\t"+price);
		double pay = price>1000? price*0.8: price;		
		
		return pay;
	}
}
