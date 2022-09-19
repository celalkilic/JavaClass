package week12monday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling_4 {

	public static void main(String[] args) throws FileNotFoundException {

		String lines = readLines("C:\\Users\\c&z\\Desktop\\celal\\teachers.txt");
		System.out.println(lines);

	}

	static String readLines(String filePath) throws FileNotFoundException {
		File file;

		Scanner fileReaderScanner = null;
		String txt = "";
		try {
			file = new File(filePath);
			fileReaderScanner = new Scanner(file);
			while (fileReaderScanner.hasNextLine()) {
				txt += fileReaderScanner.nextLine() + "\n";
			}

			return txt;

		} catch (Exception e) {
			throw new FileNotFoundException();
		} finally {
			fileReaderScanner.close();
		}

	}

}