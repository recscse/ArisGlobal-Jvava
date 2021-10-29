package practicalAssessment;

import java.util.Scanner;

public class Q12_breakfastMenuAndCoast {
	public static void main(String args[]) {
		int Sandwich=20;
		int Juice=30;
		int Tea=10;
		int Coffee=10;
		int Eggs=25;
		
		int total=0;
		
		System.out.println("Sandwich=20");
		System.out.println("Juice=30");
		System.out.println("Tea=10");
		System.out.println("Coffee=10");
		System.out.println("Eggs=25");
		
		System.out.print("Enter your menu choice: ");
		Scanner sc=new Scanner(System.in);
		int orderNumber=sc.nextInt();
		
		System.out.println("Enter quantity: ");
		int quantity=sc.nextInt();
		
		switch(orderNumber) {
		case 1: total=Sandwich;
		        break;
		        
		case 2: total=Juice;
		        break;
		       
		case 3: total=Tea;
		        break;
		        
		case 4: total=Coffee;
		        break;
		        
		case 5: total=Eggs;
		        break;
		}
		
		int price=total*quantity;
		
		System.out.println(price);

	}

}
