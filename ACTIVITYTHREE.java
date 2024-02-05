package myprojects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ACTIVITYTHREE 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int NUM1,NUM2,sum,diff,prod,quo,mod;
		System.out.print("Enter first number: ");
		NUM1 = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		NUM2 = Integer.parseInt(br.readLine());
		System.out.print("Choices: \nA = Addition \nB = Subraction "
				+ "\nC = Multiplication \nD = Division \nE = Modulo  ");
		System.out.print("\nEnter your letter choice: ");
		char choice = (char)br.read();
		sum = NUM1+NUM2;
		diff = NUM1-NUM2;
		prod = NUM1*NUM2;
		quo = NUM1/NUM2;
		mod = NUM1%NUM2;
		
		if (choice == 'a'||choice =='A') 
		{
			System.out.println("The sum is: " +sum);
		}
		else if (choice == 'b'||choice =='B') 
		{
			System.out.println("The difference is: " +diff);
		}
		else if (choice == 'c'||choice =='C') 
		{
			System.out.println("The product is: " +prod);
		}
		else if (choice == 'd'||choice =='D') 
		{
			System.out.println("The quotient is: " +quo);
		}
		else 
		{
			System.out.println("The modulo is: " +mod);
		}
	}
}
