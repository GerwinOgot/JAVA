package myprojects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ACTIVITY_1 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter your full name: ");
		String fullname = (br.readLine());
		System.out.print("Enter first number: ");
		int num1st = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		int num2nd = Integer.parseInt(br.readLine());
		System.out.print("Enter third number: ");
		int num3rd = Integer.parseInt(br.readLine());
		int sum = num1st+num2nd+num3rd;
		int dif = num1st-num2nd-num3rd;
		int pro = num1st*num2nd*num3rd;
		double quo = ((double)(num1st)/num2nd)/num3rd;
		double ave = ((double)(num1st)+num2nd+num3rd)/3;
		System.out.println("Hello, " +fullname);
		System.out.println("The sum is:  "+sum);
		System.out.println("The difference is: "+dif);
		System.out.println("The product is:  "+pro);
		System.out.println("The average is: "+ave);
		System.out.println("The quotient is:  "+quo);
		System.out.println("Thank you!");
	}
}