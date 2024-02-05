package myprojects;
import java.io.*;
public class ACTIVITYFIVE 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int repeat = 14;
		System.out.print("Enter number of input: ");
		int num1 = Integer.parseInt(br.readLine());
		do 
		{
			System.out.print("Enter number: ");
			int num2 = Integer.parseInt(br.readLine());
			repeat++;
		}
		
		while (num1 > repeat);
		{
			System.out.println("You inputted "+num1+" numbers");
			
		}
	}
}
