package topic03;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Vehicle v = new Vehicle();
//		v.setWheel(4);
//		v.setDoor(2);
//		System.out.printf("Your vehicl has：%n %d wheels and %d doors.%n", v.getWheel(), v.getDoor() );
//		
//		Vehicle v1 = new Vehicle(6);
//		System.out.printf("%d%n", v1.getWheel() );
	
		Vehicle v2 = new Vehicle(8);
//		System.out.printf("%d and %s %n", v2.getWheel(), v2.getBrand() );
//		
//		v2.setBrand("Ford");
//		System.out.printf("%d and %s %n%n", v2.getWheel(), v2.getBrand() );

		v2.print();
		v2.print(10);
		v2.print("Ford");
	}

}
