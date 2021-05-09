package yantric;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AddDataintoCollectionFromfile {

	public static void main(String[] args) throws Exception {

		String path = "C:\\cisco_doc\\D\\persional\\Resume\\file.txt";
		File newFile = new File(path);
		if (newFile.createNewFile()) {
			System.out.println("File created  " + newFile.getName());
		} else {
			System.out.println("File already created:  " + newFile.getName());
		}
		if (newFile.exists()) {
			System.out.println("File Name:  " + newFile.getName());
			System.out.println("File getPath:  " + newFile.getPath());
			System.out.println("File canRead:  " + newFile.canRead());
			System.out.println("File canWrite:  " + newFile.canWrite());
			System.out.println("File getAbsolutePath:  " + newFile.getAbsolutePath());
			System.out.println("File length:  " + newFile.length());
			System.out.println("File isFile:  " + newFile.isFile());

		} else {
			System.out.println("File does not exist");
		}
		System.out.println("......................................................................................");
		// Write into the file
		FileWriter fileWrite = new FileWriter("C:\\cisco_doc\\D\\persional\\Resume\\file.txt");
		fileWrite.write(
				"This is Jayram Dhar Dubey, I have 3 years of experience, presently working in Cisco Systems India Pvt Ltd");
		fileWrite.close();
		System.out.println("File is added succesfully ");

		Scanner read = new Scanner(new File("C:\\cisco_doc\\D\\persional\\Resume\\file1.txt"));
		ArrayList<String> listOfLines = new ArrayList<>();
		
		//hasNext() for word by word add into ArrayList
		//s.hasNextLine() read line by line
		//s.nextLine() read line by line
		while(read.hasNextLine()){
			listOfLines.add(read.next());
		}

//		while (read.hasNext()) {
//			listOfLines.add(read.next());
//		}
		System.out.println(listOfLines);
		read.close();

	}
}
