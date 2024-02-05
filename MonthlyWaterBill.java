package myprojects;
import java.util.Scanner;
public class MonthlyWaterBill 
{
		public static void main(String[] args) 
	{
		System.out.println("--MONTHLY WATER BILL COUNTER--");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Present Reading: ");
		int presread = input.nextInt();
		System.out.print("Enter your Previous Reading: ");
		int prevread = input.nextInt();
		int consump = (presread-prevread);
		int rate = 37;
		double bill = consump*rate;
		System.out.println("Present Reading       : " + presread);
		System.out.println("Previous Reading      : " + prevread);
		System.out.println("Consuption            : " + consump);
		System.out.println("Rate per cubic meter  : " + rate);
		
		System.out.println("Monthly Water bill    : " + bill);

	}

}
