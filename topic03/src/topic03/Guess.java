package topic03;

public class Guess {
	
	//initial value
	private int answer = 0;
	
	//constructor
	public Guess() {		
		answer = (int)(Math.random() * 100) + 1;
	}
	
	//getter and setter
	public int getAnswer() {
		return answer;
	}
	public void setAnswer() {
		answer = (int)(Math.random() * 100) + 1;
	}
	
	//method 判斷數字是否大於答案
	public int judge(int guess) {

		int result = 0;
		
		if( guess > this.answer) {
			result = 1;
		}else if( guess < this.answer ) {
			result = -1;
		}		
		return result;
	}
}
