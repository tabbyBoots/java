package topic04;

public class Ex05_totalAndSubtotlCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] score = new int[5][2];
		int[] subtotal = new int[2];
		
		int total = 0;
		score[0][0]= 76; score[0][1]= 80;
		score[1][0]= 88; score[1][1]= 92;
		score[2][0]= 90; score[2][1]= 94;
		score[3][0]= 98; score[3][1]= 98;
		score[4][0]= 68; score[4][1]= 70;
		
		System.out.println("12345678901234567890");
		for(int i=0; i<5 ; i++) {
			for(int j=0; j<2; j++) {
				System.out.print( score[i][j] + "\t" );
				total += score[i][j];
				subtotal[j] += score[i][j];
			}
			System.out.print( total + "\t" );
			System.out.println();
			total = 0;
		}
		System.out.println("-----------");
		System.out.print( subtotal[0] + "\t" + subtotal[1] );
		
	}

}
