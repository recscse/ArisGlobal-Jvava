package practicalAssessment;

import java.util.Scanner;

public class Q15_factorCount {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            count++; 
        }
        System.out.print("NUMBER OF FACTORS OF "+n+" IS "+count);
    }
	}


