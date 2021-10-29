package practicalAssessment;

import java.util.Scanner;

public class Q6_calculateLeastNumberOfNotes {
	 public static void main(String args[]) {
			System.out.print("\nTotal Number of Notes is = "+calculateLeastNumberOfNotes());

		 }
		 public static int calculateLeastNumberOfNotes() {
			 int number= number(),a, b, c, d, e, f, g, h,i=0, count =0;
			 int arr[] = new int[8];
			 while (number >= 500)
				{
					a = number / 500;
					number = number % 500;
					System.out.print("\nThe no. of five hundreds are : " + a);
					arr[i++]= a;
					break;
				}
				while (number >= 100)
				{
					b = number / 100;
					number = number % 100;
					System.out.print("\n\nThe no. of hundreds are : " + b);
					arr[i++]= b;
					break;
				}
				while (number >= 50)
				{
					c = number / 50;
					number = number % 50;
					System.out.print("\n\nThe no. of fifties are : " + c);
					arr[i++]= c;
					break;
				}
				while (number >= 20)
				{
					d = number / 20;
					number = number % 20;
					System.out.print("\n\nThe no. of twenties are : " + d);
					arr[i++]= d;
					break;
				}
				while (number >= 10)
				{
					e = number / 10;
					number = number % 10;
					System.out.print("\n\nThe no. of tens are : " + e);
					arr[i++]= e;
					break;
				}
				while (number >= 5)
				{
					f = number / 5;
					number = number % 5;
					System.out.print("\n\nThe no. of fives are : " + f);
					arr[i++]= f;
					break;
				}
				while (number >= 2)
				{
					g = number / 2;
					number = number % 2;
					System.out.print("\n\nThe no. of Twos are : " + g);
					arr[i++]= g;
					break;
				}
				while (number >= 1)
				{
					h = number / 1;
					number = number % 1;
					System.out.print("\n\nThe no. of ones are : " + h);
					arr[i++]= h;
					break;
				}
				for(int j= 0; j < arr.length; j++)
				{
					count += arr[j];
				}
			 return count;
		 }
		 public static int number() {
			 Scanner number = new Scanner(System.in);
			 System.out.print("Please Enter Number: ");
			 return number.nextInt();
		 }
}
