package myprojects;
import java.util.*;
public class simplerloops 
{

	public static void main(String[] args) throws Exception
	{ 
		char aws;
		int total = 0;
		do {
		
			Scanner scanner = new Scanner(System.in);
			Scanner input = new Scanner(System.in);
			System.out.println("A. Addition \nB.Odd or Even");
			System.out.print("Enter your choice: ");
			char ans = scanner.next().charAt(0);
			
			
			if (ans =='A'||ans == 'a'){
				System.out.print("Enter number of input: ");
				int num1 = input.nextInt();
			for (int x=1; x<=num1; x++){
				System.out.print("Enter input no. " + x + " : ");
				int num2 = input.nextInt();
			for (int y=0; y<1; y++){	 
				total = total + num2;
		}
			}
			
				System.out.println("The sum of the " + num1 +" inputted numbers is " + total);
		}	
				else if (ans=='B'||ans =='b'){
					System.out.print("Enter a number: ");
					int num1 = input.nextInt();
				if (num1 % 2==0){
					System.out.println(num1 + " is an even number");
				}
				else{
					System.out.println(num1 +" is an odd number");
					}
				
				}
				else{
					
					System.out.println("Invalid input");
				}
					System.out.print("Do you want to try again?");
					aws = scanner.next().charAt(0);
					
		
				}while (aws=='Y'||aws=='y');					
				System.out.print("Thank You!");
		
	}

}
