package topic06;

import topic06.Student.Birthday;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students ss01 = new Students();
		ss01.print(new Itmp() {			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("interFace");
			}
		});
		ss01.print();
	}

}

class Students {
	Birthday2 b2 = new Birthday2();
	void print() {
		System.out.println("AAA");
	}
	void print(Itmp it2) {
		it2.test();
	}
	class Birthday2 {
		int year, month, day;
	}
}

interface Itmp {
	void test();
}
