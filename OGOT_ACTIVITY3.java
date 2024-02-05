package myprojects;
import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class OGOT_ACTIVITY2 
{
	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter kilometer to travel: ");
		int kilo = Integer.parseInt(br.readLine());
		if (kilo <= 0 )
			{
				System.out.println("Please enter valid kilometers");
				return;
			}
		System.out.print("Choose your status: \nA = Student/Senior/PWD (20%) \nB = Regular ");
		System.out.print("\nEnter choice: ");
		char status = (char)br.read();
		int fare = 9;
		int afare = (kilo-4);
		int tfare = afare+fare;
		double percentage1 = (double)(fare*(20.0f/100.0f));
		double percentage2 = (double)(tfare*(20.0f/100.0f));
		double dfare = fare - percentage1;
		double daddfare = tfare-percentage2;
		if (kilo >4) 
			{
				if (status == 'a'||status =='A') 
					{
						System.out.println("Hello, your fare is: "+df.format(daddfare)+" Php");
					}
				else if(status == 'b'||status =='B') 
					{
						System.out.println("Hello, your fare is: "+df.format(tfare)+" Php");
					}
				else
					{
						System.out.println("Please enter valid status choice");
					}
			}
		else if (kilo <=4)
		{
				if (status == 'a'||status =='A') 
					{
						System.out.println("Hello, your fare is: "+df.format(dfare)+" Php");
					}
				else if(status == 'b'||status =='B') 
					{
						System.out.println("Hello, your fare is: "+df.format(fare)+" Php");
					}
				else
				{
					System.out.println("Please enter valid status choice");
				}
		}
	}
}