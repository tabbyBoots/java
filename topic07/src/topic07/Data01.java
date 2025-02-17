package topic07;

public class Data01 extends Thread {
	int data = 0;

	@Override
	public void run() {
		// super.run();
		print();
	}

	void print() {
		for (int i = 0; i < 6; i++) {
			System.out.println("DATA01" + Thread.currentThread());
		}
	}
}
