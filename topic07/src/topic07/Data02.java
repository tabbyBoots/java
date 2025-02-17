package topic07;

public class Data02 implements Runnable {
	int data = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		print();
	}

	void print() {
		for (int i = 0; i < 6; i++) {
			System.out.println("DATA02" + Thread.currentThread());
		}
	}
}