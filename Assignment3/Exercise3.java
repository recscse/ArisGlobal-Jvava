package Assignment3;

import java.util.Scanner;

public class Exercise3 {

	public String replaceConsonant(String str) {
		StringBuffer sbr = new StringBuffer(str);
		for(int i=0;i<str.length();i++) {
			char c  = sbr.charAt(i);
			if(! (c=='A' || c  =='a' || c == 'E' || c=='e'
					|| c =='I'|| c=='i' || c =='o' || c=='O' ||
					c =='U' || c == 'u')) {
				sbr.replace(i,i+1,String.valueOf((char)(c+1)));
				
			}
			
			
		}
		return sbr.toString();
	}
	public static void main(String args[]) {
		Exercise3 e = new Exercise3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		System.out.println(e.replaceConsonant(str));
		sc.close();
	}
}
