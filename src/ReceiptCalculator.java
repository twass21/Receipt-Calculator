import java.util.Scanner;

/*
 * Tyler Wassel
 * Period 5
 * Receipt Calculator
 */
public class ReceiptCalculator 
{

	public static void main(String[] args)
	{
		Scanner user = new Scanner(System.in);
	System.out.println("Tax and Tip Calculator");
	System.out.println("Please enter the name of your appetizer: ");
	String appetizerstr = user.nextLine();
	System.out.println("Please enter the price of your appetizer: ");
	String appetizerpricestr = user.nextLine();
	System.out.println("Please enter the name of your entree: ");
	String entreestr = user.nextLine();
	System.out.println("Please enter the price of your entree: ");
	String entreepricestr = user.nextLine();
	System.out.println("Please enter the name of your dessert: ");
	String dessertstr = user.nextLine();
	System.out.println("Please enter the price of your dessert: ");
	String dessertpricestr = user.nextLine();
	System.out.print("\n\n\nWhat percentage would you like to tip (as a decimal): ");
	String tipstr = user.nextLine();
	System.out.println("Item Price");
	double appetizerprice = Double.parseDouble(appetizerpricestr);
	double entreeprice = Double.parseDouble(entreepricestr);
	double dessertprice = Double.parseDouble(dessertpricestr);
	double tip = Double.parseDouble(tipstr);
	double totalcost = appetizerprice + entreeprice + dessertprice;
	double totaltip = tip*totalcost;
	
	
	
	
		
	
	

	}

}
