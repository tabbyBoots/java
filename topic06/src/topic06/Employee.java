package topic06;

public class Employee {
	String name;
	String id;
	
	void print() {
		System.out.println(name + id);
	}
}

class Personnel extends Employee {	//
	String level;
	
	@Override
	void print() {
		// TODO Auto-generated method stub
		
		super.print();
		//System.out.println(name + level);
	}

	
//	void print() {
//		System.out.println(level);
//	}
}

class Stock {
	String building;
	
	void print() {
		System.out.println(building);
	}
}