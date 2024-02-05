package myprojects;
import java.io.*;
public class ACTIVITY_6 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int choice = 0;
	do {
		int price = 0;
		int cash = 0;
		int change = 0;
		int n1000 = 0;
		int n500 = 0;
		int n200 = 0;
		int n100=0;
		int n50=0;
		int n20=0;
		int n10=0;
		int n5=0;
		int n1 = 0;
		System.out.println("                                                      ");
		System.out.print("Lugaw is ESSENTIAL Menu: \nA. = Lugaw Plain - 45 pesos "
				+ "\nB. = Lugaw w/ red Egg - 112 pesos "
				+ "\nC. = Lugaw w/ 1kg Chicken - 458 pesos ");
		System.out.print("\nEnter your order: ");
		String order = br.readLine();
		switch(order)
		{
			case "a":
				price = 45;
				break;
			case "A":
				price = 45;
				break;
			case "b":
				price = 112;
				break;
			case "B":
				price = 112;
				break;
			case "c":
				price = 458;
				break;
			case "C":
				price = 458;
				break;
		}
		System.out.print("Enter cash: ");
		cash = Integer.parseInt(br.readLine());
		change = cash - price;
		System.out.print("Your change is: " +change);
		while(change >= 1000)
		{
			change = change- 1000;
			n1000++;
		}
		while(change >=500)
		{
			change = change- 500;
			n500++;
		}
		while(change >=200)
		{
			change = change- 200;
			n200++;
		}
		while(change >=100)
		{
			change = change- 100;
			n100++;
		}
		while(change >=50)
		{
			change = change - 50;
			n50++;
		}
		while(change >=20)
		{
			change = change- 20;
			n20++;
		}
		while(change >=10)
		{
			change = change- 10;
			n10++;
		}
		while(change >=5)
		{
			change = change- 5;
			n5++;
		}
		while(change >=1)
		{
			change = change - 1;
			n1++;
		}
		System.out.println("\nMoney Breakdown: ");
		System.out.println("1000 peso bill: "+n1000);
		System.out.println("500 peso bill: "+n500);
		System.out.println("200 peso bill: "+n200);
		System.out.println("100 peso bill: "+n100);
		System.out.println("50 peso bill: "+n50);
		System.out.println("20 peso bill: "+n20);
		System.out.println("10 peso bill: "+n10);
		System.out.println("5 peso bill: "+n5);
		System.out.println("1 peso bill: "+n1);
		System.out.println("                                                      ");
		System.out.println("                                                      ");
		System.out.println("Do you want to order again? \n[1]Yes \n[2]No");
		System.out.print("Enter your choice: ");
		choice = Integer.parseInt(br.readLine());
		if (choice == 1) 
		{
			System.out.print(""); 
		}
		else if (choice == 2) 
		{
			System.out.println("Program ends here, thank you and have a nice day");
			System.exit(0);
		}
		else 
		{
			System.out.println("Invalid Input!");
			System.exit(0);
		}
	}while(choice==1);
	}

}
