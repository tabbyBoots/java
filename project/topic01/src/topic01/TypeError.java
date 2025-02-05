package topic01;

public class TypeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int math = 80, chn=90;
		int total, average;
		double weigh=1.2;
		
		total = (int)(math*weigh) + chn;
		average = total /2;
		
		System.out.println("Result:\t"+average);
	}

}
