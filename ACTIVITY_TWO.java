package myprojects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ACTIVITY_TWO 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		String name = (br.readLine());
		System.out.print("Enter your middle initial: ");
		char midin = (char)br.read(); 
		System.out.print(""); //using br.read() skips 1 br.readline 
		String ltname = (br.readLine()); //thats why i put a useless br.readline
		System.out.print("Enter your last name: ");
		String lname = (br.readLine());
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("Enter your temperature in celsius: ");
		double celsius = Double.parseDouble(br.readLine());
		double farenheit = ((celsius * 9/5)+32);
		double kelvin = (celsius + 273.15);
		int bornyear = 2021 - age;
		System.out.println("Hello, "+name+" "+midin+" "+lname);
		System.out.println("You were born in the year: "+bornyear);
		System.out.println("Your temperature in Celsius is: "+celsius);
		System.out.println("Your temperature in Farenheit is: "+farenheit);
		System.out.println("Your temperature in Kelvin is: "+kelvin);
	}
}