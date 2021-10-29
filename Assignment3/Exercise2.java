package Assignment3;

import java.util.Scanner;

public class Exercise2 {
	public String getImage(String str) {
		StringBuffer sbr = new StringBuffer(str);
		sbr.append('|');
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
	}
	
	public static void main(String args[]) {
		Exercise2 e = new Exercise2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String");
		String str = sc.next();
		System.out.println(e.getImage(str));
		sc.close();
		
	}

}
