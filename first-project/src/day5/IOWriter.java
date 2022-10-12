package day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOWriter {

	public static void main(String[] args) {

		File file = new File("h:\\galaxe.txt");

		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(file);
			int i = 0;

			fs.write((char)65);
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Successfully written");
	}

}
