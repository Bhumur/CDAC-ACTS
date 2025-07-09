package com.cdac.acts.canteen.customer;
import java.util.Scanner;
import com.cdac.acts.canteen.wander.Food;

public class FoodOrder{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.println("######################			SET MENU			#####################################");
		String []item = new String[5];
		double []pri = new double[5];
		for(int i=0;i<5;i++){
			System.out.print("Enter "+(i+1)+" Name of Item : ");
			item[i] = sc.next();
			System.out.print("Enter "+(i+1)+" Price of Item : ");
			pri[i] = sc.nextDouble();
		}
		Food F = new Food(item,pri);
		
		System.out.println("######################			TAKE ORDER				#####################################");

		int op;
		do{
			System.out.println("OPTIONS:-");
			System.out.println("1. Give Order");
			System.out.println("0. Exit");
			System.out.print("Enter Option : ");
			op = sc.nextInt();
			if(op==1){
				F.printMenu();
				System.out.print("Enter Number of Items Want to Order : ");
				int n = sc.nextInt();
				
				int []order = new int[n];
				int []qty = new int[n];
				
				for(int i=0;i<n;i++){
					System.out.print("Enter Item Index : ");
					order[i] = sc.nextInt();
					System.out.print("Enter Item Quantity : ");
					qty[i] = sc.nextInt();
				}
				
				System.out.println("Bill : "+F.genbill(order,qty));
			}
			else{
				break;
			}
		}while(true);
	}
}
				
			
			
		
