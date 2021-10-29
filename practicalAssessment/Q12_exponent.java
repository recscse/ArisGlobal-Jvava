package practicalAssessment;

import java.util.Scanner;

public class Q12_exponent {
	public static void main(String[] args) {
	
          int base;
          int exponent;
          long result=1;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter base: ");
          base=sc.nextInt();
          System.out.println("Enter exponent: ");
          exponent=sc.nextInt();
          while(exponent!=0) {
        	  result=result*base;
        	  exponent--;
          }
          System.out.println("Result: "+result);
	}

}
