package com.dbConnect;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyInput {
	public static void main(String[] args) {

		byte[] array = new byte[50];
		try {
			FileInputStream sourceFile = new FileInputStream("src/com/dbConnect/input.txt");
			FileOutputStream destFile = new FileOutputStream("src/com/dbConnect/newFile");

			// reads all data from input.txt
			sourceFile.read(array);

			// writes all data to newFile
			destFile.write(array);
			System.out.println("The input.txt file is copied to newFile.");

			// closes the stream
			sourceFile.close();
			destFile.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
