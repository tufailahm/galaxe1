package day4;

import java.io.File;
import java.io.IOException;

public class DemoIO1 {

	public DemoIO1() {

	}

	public static void main(String[] args) throws IOException {
		File file = new File("hello.txt");

		if (file.exists()) {
			System.out.println("file exists and deleted");
			file.delete();
		} else {
			System.out.println("file does not exists and created");
			file.createNewFile();
		}

		File file1 = new File("D:\\TrainingMaterial");

		System.out.println(file1.exists());

		File file2 = new File("H:\\mywork");

		System.out.println(file2.exists());

		file2.mkdir();

		String all[] = file1.list();
		for(String s:all) {
			System.out.println(s);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}