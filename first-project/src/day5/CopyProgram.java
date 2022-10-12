package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyProgram {

	public static void main(String[] args) {

		// Enter the file name to read a.txt
		// Enter the file name to write b.txt

		// Successfully copied a.txt into b.txt

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the file name to read	: ");
		String fileRead = scanner.next();

		File fileR = new File(fileRead);

		if (!fileR.exists()) {
			System.out.println(fileRead + " does not exists");
			System.exit(0);
		}
		
		System.out.println("Enter the file name to write :	");
		String fileWrite = scanner.next();

		FileInputStream fsRead = null;
		FileOutputStream fsWrite = null;
		try {
			fsRead = new FileInputStream(fileR);
			fsWrite = new FileOutputStream(fileWrite);

			int i = 0;

			while ((i = fsRead.read()) != -1) {
				fsWrite.write((char) i);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fsRead.close();
				fsWrite.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Successfully copied " + fileRead + " to " + fileWrite);

	}

}
