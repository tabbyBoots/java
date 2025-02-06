package topic02;

import java.util.Scanner;

public class GuessNumber {
	//猜數字，範圍從1-100，可猜5次
	
	Scanner s = new Scanner(System.in);
	
	int guess = 0;
	int result = (int) (Math.floor(Math.random() * 100));	
	
	void eval() {
		
		System.out.println("目標:\t" + result);
		for (int i = 0; i < 5; i++) {

			System.out.print(">");
			guess = s.nextInt();

			if (guess != result) {
				System.out.print("不對喔!\t");

				if (guess > result) {
					System.out.print("小一點。 ");
				} else {
					System.out.print("大一點。 ");
				}

				if (i < 4) {
					System.out.println("還剩" + (4 - i) + "次");
				} else {
					System.out.println("沒機會了");
				}
			} else {
				System.out.println("猜對了\n");
				break;
			}
		}

	}

}
