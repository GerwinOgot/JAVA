package myprojects;
import java.util.Scanner;
public class activity1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter your name: ");
		String name= sc.nextLine();
		System.out.print("Enter your course: ");
		String cou= sc.nextLine();
		System.out.print("Enter your year and section: ");
		String yrsec= sc.nextLine();
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
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
