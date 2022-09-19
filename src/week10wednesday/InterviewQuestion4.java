package week10wednesday;

import java.io.File;
import java.io.FilenameFilter;

public class InterviewQuestion4 {

	public static void main(String[] args) {
		// input: "C:\Development\root"
		// output: There are 2 json file found
		//			file1.json, file3.json
		
		findJson("C:\\Development\\root");


	}
	static void findJson(String json) {
		File file = new File(json);
		FilenameFilter filenameFilter = (dir, name)->{return name.endsWith(".json");};
		File [] jsonFiles = file.listFiles(filenameFilter); 
			
		System.out.println(jsonFiles);
		}

}
