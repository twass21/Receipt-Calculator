import java.util.Scanner;

/*
 * Tyler Wassel
 * Period 5
 * Stock Calculator
 */
public class StockCalculator
{

	public static void main(String[] args)
	{
		Scanner user = new Scanner (System.in);
		System.out.println("Please enter the number of stocks  you purchased: ");
		String num = user.nextLine();
		System.out.println("Please enter the price per share: ");
		String price= user.nextLine();
		System.out.print("Please enter the commission rate to be paid to the stock broker (as decimal)");
		String comm = user.nextLine();
		System.out.print("Please enter the price per share that the stocks were sold for");
		String share = user.nextLine();
		System.out.print("Please enter the commission rate to be  paid to the stock broker (as a decimal)" );
		String pay = user.nextLine();
		double num1 = Double.parseDouble(num);
		double price1 = Double.parseDouble(price);
		double comm1 = Double.parseDouble(comm);
		double share1 = Double.parseDouble(share);
		double pay1 = Double.parseDouble(pay);
		
	}

}
