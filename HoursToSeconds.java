package myprojects;
import java.util.Scanner;
public class HoursToSeconds 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("HOURS TO SECONDS CONVERTER");
		System.out.print("Enter the desired number of Hours: ");
		int hrs = input.nextInt();
		int sec = hrs*60;
		System.out.println("The converted hours to seconds is : " +sec);

	}

}
