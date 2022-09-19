package week11wednesday;

import java.io.File;

public class FileDirectory {

	public static void main(String[] args) {
		File directory = new File("C:\\Users\\c&z\\Desktop\\celal");
		directory.mkdir();
		
		String folder = directory.getAbsolutePath();
		System.out.println(folder);
		
		System.out.println(directory.getName());

	}

}
