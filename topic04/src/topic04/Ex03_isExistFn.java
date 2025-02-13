package topic04;

public class Ex03_isExistFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] source = {"apple", "tomato", "grape", "orange", "melon"};
		String data = "orange";
		
		System.out.println("You are looking for: " + data);

		
		Searching se = new Searching();		
		
		//Ex03_isExistFn e= new Ex03_isExistFn();
		
		System.out.println( se.isExist(data, source) );
	}
	
//	boolean isExist(String data, String[] source) {
//		boolean result = false;
//		
//		System.out.println("You are looking for: " + data );
//		
//		for(String tmp : source) {
//			if( tmp == data ) {
//				result = true;
//				break;
//			}
//			System.out.println("Current fruit: " + tmp +" \t "+ data +" is not in the array.");
//		}
//		
//		return result;
//	}

}
