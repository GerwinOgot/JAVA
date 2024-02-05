package myprojects;
import java.util.Scanner;
class info
{
	 static int acnum;
	 static int pin;
	 static String acname;
	 static int age;
	 static String add;
	 static String gender;
	 static String civilstatus;
   
    Scanner sc=new Scanner(System.in);
    void input() 
    {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your account number: ");
	acnum = input.nextInt();
	System.out.print("Enter your pin number: ");
	pin = input.nextInt();
	input.nextLine();
	System.out.print("Enter your account name: ");
	acname = input.nextLine();
	System.out.print("Enter your age: ");
    age = input.nextInt();
    input.nextLine();
    System.out.print("Enter your address: ");
    add = input.nextLine();
    System.out.print("Enter your gender: ");
    gender = input.nextLine();
    System.out.print("Enter your civil status: ");
    civilstatus = input.nextLine();
    }
}

public class ogot_lab_act2 extends info
{
	void display() {
		System.out.println("Your account number is: "+acnum );
		System.out.println("Your pin is: "+pin );
		System.out.println("Your account name is: "+acname );
		System.out.println("Your age is: "+age );
		System.out.println("Your address is: "+add );
		System.out.println("Your gender is: "+gender );
		System.out.println("Your civil status is: "+civilstatus );
	}
	public static void main(String[] args) 
	{
		ogot_lab_act2 obj = new ogot_lab_act2();
		obj.input();
		obj.display();
		Scanner scanner = new Scanner(System.in);
		char choice;
		int num;
		do {
			System.out.println("                                                      ");
			System.out.println("What would you like to do? \nA.I would like to check my information "
					+ "\nB. I would like to update my information \nC.I would like to exit");
			System.out.print("Enter your choice: ");
			choice = scanner.next().charAt(0);
			if (choice=='A'||choice =='a') 
			{
				System.out.println("                                                      ");
				System.out.println("Your account number is: "+acnum );
				System.out.println("Your pin is: "+pin );
				System.out.println("Your account name is: "+acname );
				System.out.println("Your age is: "+age );
				System.out.println("Your address is: "+add );
				System.out.println("Your gender is: "+gender );
				System.out.println("Your civil status is: "+civilstatus );

			}
			else if (choice =='B'||choice =='b') 
			{
				Scanner input = new Scanner(System.in);
				System.out.println("                                                      ");
				System.out.print("Enter your account number: ");
				acnum = input.nextInt();
				System.out.print("Enter your pin number: ");
				pin = input.nextInt();
				input.nextLine();
				System.out.print("Enter your account name: ");
				acname = input.nextLine();
				System.out.print("Enter your age: ");
			    age = input.nextInt();
			    input.nextLine();
			    System.out.print("Enter your address: ");
			    add = input.nextLine();
			    System.out.print("Enter your gender: ");
			    gender = input.nextLine();
			    System.out.print("Enter your civil status: ");
			    civilstatus = input.nextLine();
			 
			}
			else
			{
				System.exit(0);
			}
			System.out.println("                                                      ");
			System.out.println("Would you like to restart? \n1. YES \n2. NO");
			System.out.print("Enter your choice: ");
			num = scanner.nextInt();
		}while(num==1);
	}

}
