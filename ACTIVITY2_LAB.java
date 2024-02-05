package myprojects;
import java.util.Scanner;
class personinfo{
	 int acnum;
	 int pin;
	 String acname;
     int age;
     String add;
     String gender;
     String civilstatus;
    
    Scanner sc=new Scanner(System.in);
    void input() {
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

class allinfo extends personinfo{
	void display() {
		System.out.println("Your account number is: "+acnum );
		System.out.println("Your pin is: "+pin );
		System.out.println("Your account name is: "+acname );
		System.out.println("Your age is: "+age );
		System.out.println("Your address is: "+add );
		System.out.println("Your gender is: "+gender );
		System.out.println("Your civil status is: "+civilstatus );
	}
}


public class ACTIVITY2_LAB {
	public static void main(String[] args) {
		allinfo obj = new allinfo();
		obj.input();
		obj.display();
	}

}
