package myprojects;
import java.io.*;
public class act4_switch 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter number of student: ");
		int numstu = Integer.parseInt(br.readLine());
		System.out.print("Enter number of senior: ");
		int numsen = Integer.parseInt(br.readLine());
		System.out.print("Enter number of regular: ");
		int numreg = Integer.parseInt(br.readLine());
		System.out.print("Choices: \nA = Foreign (240 pesos) \nB = Local (210 pesos) ");
		System.out.print("\nEnter choice: ");
		char choice = (char)br.read();
		int tpax = numstu+numsen+numreg;
		double foreignstu = (240 - (double)(240*(20.0f/100.0f))) * numstu;
		int foreignreg = 240 * numreg;
		int foreignsen = 0*numreg;
		double tforeign = foreignstu + foreignreg +foreignsen;
		double localstu = (210 - (double)(210*(20.0f/100.0f))) * numstu;
		int localreg = 210 * numreg;
		int localsen = 0*numreg;
		double tlocal = localstu + localreg + localsen;
		switch(choice) 
			{
				case 'a':
					System.out.println("Total pax: "+tpax);
					System.out.println("Cinema Fare: "+ tforeign);
					break;
				case 'A':
					System.out.println("Total pax: "+tpax);
					System.out.println("Cinema Fare: "+ tforeign);
					break;
				case 'b':
					System.out.println("Total pax: "+tpax);
					System.out.println("Cinema Fare: "+ tlocal);
					break;
				case 'B':
					System.out.println("Total pax: "+tpax);
					System.out.println("Cinema Fare: "+ tlocal);
					break;
				default:
					System.out.println("Invalid Choice");
			}
	}

}
