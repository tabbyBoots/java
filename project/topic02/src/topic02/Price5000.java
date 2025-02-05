package topic02;

public class Price5000 {
	
	double calcPay(int price) {
		System.out.println("Price:\t"+price);
		double pay = 0;
		
		if(price>=5000) {
			pay = price*0.7;
		}else if( price>=4000 && price<5000 ) {
			pay = price*0.8;
		}else if( price>=3000 && price<4000 ) {
			pay = price*0.9;
		}else {
			pay=price;
		}

		return pay;
	}
}
