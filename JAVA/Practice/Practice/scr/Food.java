package com.cdac.acts.canteen.wander;

public class Food{
	private String []items = new String[5];
	private double []price = new double[5];
	
	public Food(String []item, double []pri){
		for(int i=0;i<5;i++){
			this.items[i]=item[i];
			this.price[i]=pri[i];
		}
	}
	
	public void printMenu(){
		System.out.println("Sno.		Menu			Item");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+".			"+items[i]+"		"+price[i]);
		}
	}
	public double genbill(int []order, int []qty){
		int size=order.length;
		
		double bill=0;
		
		
		for(int i=0;i<size;i++){
			bill+=price[order[i]-1]*qty[i];
		}
		
		return bill;
	}
}
	
	
	