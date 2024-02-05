package myprojects;
import java.io.*;

public class LOOPS 
{

	public static void main(String[] args) throws Exception{
		char answer;
		do{
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
			int total = 0;
				System.out.println("A. Addition \nB.Odd or Even");
				System.out.print("Enter your choice: ");
				char choice = (char)br.read();
				br.readLine();
				
			if (choice =='A'||choice == 'a'){
				System.out.print("Enter number of input: ");
				int num = Integer.parseInt(br.readLine());
			for (int x=1; x<=num; x++){
				System.out.print("Enter input no " + x + " : ");
				int num1 = Integer.parseInt(br.readLine());
			for (int y=0; y<1; y++){
				total = total + num1;
			}
		}
			System.out.println("The sum of the " + num +" inputted numbers is " +total);
	}	
			else if (choice=='B'||choice =='b'){
				System.out.print("Enter a number: ");
				int num = Integer.parseInt(br.readLine());
			if (num % 2==0){
				System.out.println(num + " is an even number");
			}
			else{
				System.out.println(num +" is an odd number");
				}
			
			}
			else{
				
				System.out.println("Invalid input");
			}
				System.out.print("Do you want to try again?");
				answer=(char)br.read();
				br.readLine();
	
		} while ((answer=='Y')||(answer=='y'));
				System.out.print("Thank You!");
	}

}
