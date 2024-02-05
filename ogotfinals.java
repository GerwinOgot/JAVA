package myprojects;
import java.util.Scanner;
class exfin {
	 void display()
	 {
		 System.out.print("Input number of sequences:");
		 Scanner scanner = new Scanner(System.in);
		 int input = scanner.nextInt();
		 int n1 = 0, n2 = 1;
		 System.out.print("Fibonacci Series: ");
		 for (int i = 1; i <= input; i++)
	        {
	            System.out.print(n2+" ");
	            int next = n1 + n2;
	            n1 = n2;
	            n2 = next;
	        }
	 }
}
class ogotfinals extends exfin{
	public static void main(String[] args) {
		 ogotfinals obj = new ogotfinals();
		 obj.display(); 	 
	}

}
