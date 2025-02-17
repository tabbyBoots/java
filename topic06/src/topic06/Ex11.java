package topic06;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader ir;
		ir = new InputStreamReader(System.in);
		
		int c;
		
		try {
			while( ( c = ir.read() ) != -1 ) {
				System.out.print( (char)c );
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}
		
	}

}
