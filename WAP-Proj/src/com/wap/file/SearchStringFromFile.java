package com.wap.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Q1- how to search name from file?
 * Q2- how to search no of name/word available into file?
 * 
 * @author Vivek.Kumar
 *
 */
public class SearchStringFromFile {
	///ZZ_Java8_Features/dir/file/searchWord.txt
	public static void main(String[] args)  {
		
		File file = new File("dir/file/searchWord.txt");
		String key = "You"; // searching word
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				   final String lineFromFile = scanner.nextLine();
				   if(lineFromFile.contains(key)) { 
				       // a match!
				       System.out.println("I found [" +key+ "] in file " +file.getName());
				       
				   }
				}
		} catch (FileNotFoundException e) {
			
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
	}

}
