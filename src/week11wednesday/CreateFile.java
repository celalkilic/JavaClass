package week11wednesday;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File directory = new File("C:\\Users\\c&z\\Desktop\\celal");
		directory.mkdir();
		
		String folder = directory.getAbsolutePath();
		System.out.println(folder);
		
		File file1 = new File(folder + "\\students.txt");
		File file2 = new File(folder + "\\teachers.txt");
		
		try {
			file1.createNewFile();
			file2.createNewFile();
		} catch (IOException e) {
			System.err.println("IOException caught");
		}
	}

}
