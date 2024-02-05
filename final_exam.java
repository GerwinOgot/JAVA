package myprojects;
import java.util.Scanner;

class compute {
	void todo() {
		  System.out.print("Fibonacci Series: ");

	}
	
}

public class final_exam extends compute {

    public static void main(String[] args) {

    	System.out.print("Input number of sequences:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
      
        int n1 = 0, n2 = 1;
		 for (int i = 1; i <= input; i++)
	     {
	            System.out.print(n2+" ");
	            int next = n1 + n2;
	            n1 = n2;
	            n2 = next;
	            i++;
	        }
    }
}