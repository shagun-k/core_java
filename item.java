import java.util.*;
class Item
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double sp,price,profit,cp;
		System.out.println("Enter Selling price of 15 items:");
		sp = sc.nextDouble();
		System.out.println("Enter profit earned on 15 items:");
		profit = sc.nextDouble();
		cp = sp-profit;
		System.out.println("Cost price of 15 items: " + cp);
		price = cp/15;
		System.out.println("Cost price of each item: " + price);
	}
}