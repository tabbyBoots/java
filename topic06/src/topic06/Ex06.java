package topic06;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Hello" );
		System.out.println( parse("Hello") );
		System.out.println( parse2("pmmfI") ); //pmmfI //Ifmmp
	}
	
	static String parse(String a) {
		String result = "";
		char tmp = 'a';
		for(int i=0; i < a.length(); i++) {
			tmp = (char)(a.charAt(i) + 1);
			result += tmp;
		}
		result = reverse(result);
		return result;
	}
	
	static String parse2(String a) {
		String result = "";
		char tmp = 'a';
		for(int i=0; i < a.length(); i++) {
			tmp = (char)(a.charAt(i) - 1);
			result += tmp;
		}
		result = reverse(result);
		return result;
	}
	
	static String reverse(String a) {
		//String result = "";
		String result = "";
		char tmp = 'a';
		for(int i=a.length()-1; i >= 0; i--) {
			tmp = a.charAt(i);
			result += tmp;
		}
		return result;
	}
}
