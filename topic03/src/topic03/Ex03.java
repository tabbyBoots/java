package topic03;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Guess g = new Guess();
		
		String p="";
		boolean play = true;
		
		while(play) {
			System.out.println("答案：" + g.getAnswer() );
			System.out.println("請猜");			
			
			for(int i=0; i<=1; i++) {
				
				int guess = s.nextInt();		
				int result = g.judge(guess);
				
				if(result == 1) {
					System.out.printf("太大了%n");
				}else if(result == -1) {
					System.out.printf("太小了%n");
				}else {
					System.out.printf("猜對了%n%n");
					break;
				}	
			}		
		
			System.out.printf("要再玩嗎?%n1:\tyes%n0:\tno%n>");

			p = s.next();
			
			// java字串判斷建議用 contentEquals()函數
			if( p.contentEquals("no") || p.contentEquals("n")) {
				System.out.print("不玩了\n");
				play = false;
				System.out.printf("%nEND%n");
			}else {
				System.out.print("繼續\n\n");
				g.setAnswer();
			}	
		}
	}
}