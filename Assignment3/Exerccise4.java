package Assignment3;

import java.util.Scanner;

public class Exerccise4 {
	
 
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		String s = String.valueOf(n);
		StringBuffer str = new StringBuffer();
		
		String res = "";
		for(int i=0;i<s.length()-1;i++) {
			int r = Math.abs((int) s.charAt(i) - (int)s.charAt(i+1));
//			System.out.print(r);
			StringBuffer sb = new StringBuffer(Integer.toString(r));
			str.append(sb);
			
		}
		str.append(s.charAt(s.length()-1));
//		System.out.print(s.charAt(s.length()-1));
		System.out.print(str);
		
		
	}
}
