package topic06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex15_buffer {

	public static void main(String[] args) {

		FileInputStream fs = null;
		FileOutputStream fo = null;
		BufferedInputStream bs = null;
		BufferedOutputStream bo = null;

		int c = 0;

		System.out.println("Initiate BufferInputStream Writing.");

		try {
			fs = new FileInputStream("01.mp4");
			fo = new FileOutputStream("03.mp4");
			bs = new BufferedInputStream(fs);
			bo = new BufferedOutputStream(fo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			while ((c = bs.read()) != -1) {
				bo.write(c);
			}
			bs.close();
			bo.close();
			fs.close();
			fo.close();
			System.out.println("BufferOutputStream Writing completed.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
