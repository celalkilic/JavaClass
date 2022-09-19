package week11wednesday;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterFile {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\c&z\\Desktop\\celal\\students.txt";
		FileWriter writer = new FileWriter("C:\\Users\\c&z\\Desktop\\celal\\students.txt");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of students: ");
		int number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("enter student ID and Name: ");
			String id = scanner.next();
			String name = scanner.next();
			writer.write(id+"-"+name+"\n");
		}
		writer.close();
		
		File file = new File(path);
		scanner = new Scanner(file);
		while (scanner.hasNext()) {
			String string = (String) scanner.nextLine();
			System.out.println(string+" ");
			
		}
		

	}

}
