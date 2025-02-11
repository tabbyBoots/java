package topic06;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println( cvrtString('Q') );
		System.out.println( cvrtString("TESt java Java aV av") );
	}	
	//方法多載 overlord
	static String cvrtString(String a) {
		// J 106
		// j 74
		char tmp;
		String result = "";
		for(int i=0; i < a.length(); i++) {
			tmp = a.charAt(i);
			if(tmp >= 97 ) {
				tmp -= 32;
			}else if(tmp <= 97 && tmp >= 65){
				tmp +=32;
			}
			result += tmp;
		}		
		return result;
	}
	
	static char cvrtString(char a) {
		if(a > 97) {
			a -= 32;
		}else if(a < 97 && a > 64){
			a +=32;
		}	
		return a;
	}

}
