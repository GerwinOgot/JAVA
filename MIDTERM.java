package myprojects;
import java.io.*;
public class MIDTERM {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int num = 0;
		char choice0 = 0;
		String fname =" ";
		String cnum =" ";
		String eadd =" ";
do {		
		do {
		System.out.println("                                                      ");
		System.out.println("Hello! This is your DCIT 23C Contact Tracing Form: ");
		System.out.print("Enter your name: ");
		fname = (br.readLine());
		System.out.print("Enter your contact number: ");
		cnum = (br.readLine());
		System.out.print("Enter your email address: ");
		eadd = (br.readLine());
		choice0 = 'g';
		if (fname.isEmpty() || (eadd.isEmpty()) || (cnum.isEmpty()))
		{
			System.out.println("Sorry, you need to provide all necessary details above");
			System.out.println("                                                      ");
			System.out.println("Fill up form again? \nA.Yes,please \nB.No,thanks");
			System.out.print("Enter your choice: ");
			choice0 = (char)br.read();
			if (choice0 == 'a'||choice0 =='A') 
			{
				System.out.print(""); //using br.read() skips 1 br.readline 
				String ltname = (br.readLine()); //thats why i put a useless br.readline
			}
			else if (choice0 == 'b'||choice0 =='B') 
			{
				System.out.println("Program ends here, thank you and have a nice day");
				System.exit(0);
			}
			else 
			{
				System.out.println("Invalid Input!");
				System.exit(0);
			}
		}
		}while(choice0=='a'|| choice0=='A');
		System.out.println("Place of origin: \n[1] NCR + Bubble \n[2] Other areas (kindly specify)");
		System.out.print("Enter your place of origin: ");
		int por = Integer.parseInt(br.readLine());
		if (por == 1)
		{
			System.out.println("YOU WILL UNDERGO IN A 14 DAYS QUARANTINE DUE TO YOUR PLACE OF ORIGIN.");
			int count = 1;
			int ctr_odd = 0, ctr_even = 0;
			String cct = " ";
			do
			{
			System.out.println("Day "+count+" - Having any symptoms? [1]YES  [2]NO");
			count++;
			System.out.print("Enter choice: ");
			num = Integer.parseInt(br.readLine());
			if (num != 1 && num != 2)
			{
				System.out.println("Wrong Input!");
				System.out.println("                                                      ");
				System.out.println("Fill up form again? \nA.Yes,please \nB.No,thanks");
				System.out.print("Enter your choice: ");
				choice0 = (char)br.read();
				choice0 = 'g';
				if (choice0 == 'a'||choice0 =='A') 
				{
					System.out.print(""); //using br.read() skips 1 br.readline 
					String ltname = (br.readLine()); //thats why i put a useless br.readline
				}
				else if (choice0 == 'b'||choice0 =='B') 
				{
					System.out.println("Program ends here, thank you and have a nice day");
					System.exit(0);
				}
				else 
				{
					System.out.println("Invalid Input!");
					System.exit(0);
				}
			}
				if (num % 2==0)
				{
					ctr_even++;
					if (ctr_even >=7) 
					{
						cct = "Asymptomatic Case";
					}
					else
					{
						cct = "Mild Case";
					}
				}
				else
				{
					ctr_odd++;
					if (ctr_odd >=7) 
					{
						cct = "Severe Case";
					}
					else
					{
						cct = "Mild Case";
					}
				}
			}while (count <= 14);
			System.out.println("                                                      ");
			System.out.println("                                                      ");
			System.out.println("END OF YOUR QUARANTINE");
			System.out.println("Result: ");
			System.out.println("Name: "+fname);
			System.out.println("Contact Number: "+cnum);
			System.out.println("Email Address: "+eadd);
			System.out.println("Place of Origin: NCR+Bubble, Philipines");
			System.out.println("Case Category: "+cct);
		}

		
		else if (por == 2)
		{
			System.out.println("YOU WILL UNDERGO IN A 7 DAYS QUARANTINE DUE TO YOUR PLACE OF ORIGIN.");
			System.out.print("Enter specific area: ");
			String area = br.readLine();
			int count = 1;
			int ctr_odd = 0, ctr_even = 0;
			String cct = " ";
			do
			{
				System.out.println("Day "+count+" - Having any symptoms? [1]YES  [2]NO");
				count++;
				System.out.print("Enter choice: ");
				num = Integer.parseInt(br.readLine());
				if (num != 1 && num != 2)
				{
					System.out.println("Wrong Input!");
					System.out.println("                                                      ");
					System.out.println("Fill up form again? \nA.Yes,please \nB.No,thanks");
					System.out.print("Enter your choice: ");
					choice0 = (char)br.read();
					choice0 = 'g';
					if (choice0 == 'a'||choice0 =='A') 
					{
						System.out.print(""); //using br.read() skips 1 br.readline 
						String ltname = (br.readLine()); //thats why i put a useless br.readline
					}
					else if (choice0 == 'b'||choice0 =='B') 
					{
						System.out.println("Program ends here, thank you and have a nice day");
						System.exit(0);
					}
					else 
					{
						System.out.println("Invalid Input!");
						System.exit(0);
					}
				}
				if (num % 2==0)
				{
					ctr_even++;
					if (ctr_even >= 4) 
					{
						cct = "Asymptomatic Case";
					}
					else
					{
						cct = "Mild Case";
					}
				}
				else
				{
					ctr_odd++;
					if (ctr_odd >= 4) 
					{
						cct = "Severe Case";
					}
					else 
					{
						cct = "Mild Case";
					}
				}
			}while (count <= 7);
			System.out.println("                                                      ");
			System.out.println("                                                      ");
			System.out.println("END OF YOUR QUARANTINE");
			System.out.println("Result: ");
			System.out.println("Name: "+fname);
			System.out.println("Contact Number: "+cnum);
			System.out.println("Email Address: "+eadd);
			System.out.println("Place of Origin: "+area+", Philipines");
			System.out.println("Case Category: "+cct);
		}
	}while(choice0=='a'|| choice0=='A');
}
}
		
	


