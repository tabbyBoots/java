package topic06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		int c;
		String str = "";

		try {
			fr = new FileReader("test01.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			fw = new FileWriter("test02.txt", true);
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
				str += (char) c;
			}
			fw.write("\n" + str);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fr.close();
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
