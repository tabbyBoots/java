package topic06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fs = null;
		FileOutputStream fo = null;
		int c = 0;

		try {
			fs = new FileInputStream("test01.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			fo = new FileOutputStream("test03.txt");
			while ((c = fs.read()) != -1) {
				System.out.print((char) c);
				fo.write(c);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fo.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
