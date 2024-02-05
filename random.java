package myprojects;
import java.util.*;
public class random
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number;
		int total = 0;
		System.out.print("Enter a number: ");
		number = input.nextInt(); // your first input number ie. 4 is taken as input
		while (number != 1) // while starts because 4 > 1
		{
		if (number < 5) total = total + number; 
		System.out.print("Enter a number: ");
		number = input.nextInt();

		}

	}
}