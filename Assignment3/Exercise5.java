package Assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise5 {
	public static void main(String args[]) {
	try {
		int lines =0, chars = 0,words =0;
		int code =0;
		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream("D:\\ArisGlobal\\src\\Assignment3\\sample.txt");
		while(fis.available()!=0) {
			code = fis.read();
			if(code!=10)
				chars++;
			if(code == 32)
				words++;
			if(code == 13) {
				lines++;
				words++;
			}
		}
		System.out.println("No. of characters = "+chars);
		System.out.println("No. of words = " + (words+1));
		System.out.println("No. of lines = "+(lines+1));
	}
	catch(FileNotFoundException e) {
		System.out.println("Cannot find specified file");
	}
	catch(IOException i) {
		System.out.println("cannot read file...");
	}
 }
}

