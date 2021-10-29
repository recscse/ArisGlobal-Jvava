package practicalAssessment;

import java.util.Scanner;

public class Q19_sumOfDigitOdFactorial {
	public static void main(String args[]) {
		System.out.println("Enter the factorial");
		Scanner sc = new Scanner(System.in); 
		 int  n = sc.nextInt();
		int sum =0;
		 int t  = n;
		 while(t!=0) {
			 int fact = 1;
			 int rem = t%10;
			 while(rem !=0) {
				 fact = fact*rem;  
				 rem--;
			 }
			 sum = sum+fact;
			 t =t/10;	 
		 }
		 System.out.println(sum);
		 if(n == sum) {
			 System.out.println("Yes, Strong NUmber");
		 } else {
			 System.out.println("No not a Strong number");
		 }
	}

}
