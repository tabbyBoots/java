package topic03;

import java.util.Scanner;

public class Ex02 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Guess g = new Guess();
		
		//System.out.println("答案：" + g.getAnswer() );
		System.out.println("請猜");			
		
		for(int i=0; i<=4; i++) {
			
			int guess = s.nextInt();		
			int result = g.judge(guess);
			
			if(result == 1) {
				System.out.printf("太大了  %d%n", result);
			}else if(result == -1) {
				System.out.printf("太小了  %d%n", result);
			}else {
				System.out.println("猜對了");
				break;
			}	
		}				
	}
}
