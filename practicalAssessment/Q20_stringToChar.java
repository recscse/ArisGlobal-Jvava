package practicalAssessment;

import java.util.Scanner;

public class Q20_stringToChar {
	 public static void main(String args[])
	    {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the string");
	        String str = sc.next();
	  
	        
	        char[] ch = new char[str.length()];
	  
	
	        for (int i = 0; i < str.length(); i++) {
	            ch[i] = str.charAt(i);
	        }
	        for (char c : ch) {
	            System.out.println(c);
	        }
	    }

}
