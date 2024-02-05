package myprojects;
import java.io.*;
public class ACTIVITYONE 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int num1, num2;
		System.out.print("Enter your name: ");
		String name = (br.readLine());
		System.out.print("Enter your course: ");
		String cou= (br.readLine());
		System.out.print("Enter your year and section: ");
		String yrsec= (br.readLine());
		System.out.print("Enter first number: ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		num2 = Integer.parseInt(br.readLine());
		System.out.println("                                                ");
		int sum = num1+num2;
		int dif = num1-num2;
		int pro = num1*num2;
		int quo = num1/num2;
		System.out.println("My name is: " +name);
		System.out.println("The sum is:  "+sum);
		System.out.println("The difference is: "+dif);
		System.out.println("The product is:  "+pro);
		System.out.println("The quotient is:  "+quo);
		System.out.println(cou+" "+yrsec+" AY 2020-2021");
	}

}
