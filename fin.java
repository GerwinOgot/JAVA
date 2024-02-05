package myprojects;
import java.util.Scanner;
class variable{
	public static int start(int i){
		return i;
	}
}
class var2 extends variable {
	public boolean next(int j,int i) {
		return i<=0;
	}
}

public class fin   {
	public static void main(String[]args) {
	 var2 V = new var2();
	 int n1 = 0, n2 = 1;
	 System.out.print("Input number of sequences:");
     Scanner scanner = new Scanner(System.in);
     int j = scanner.nextInt();
     scanner.close();
     System.out.print("Fibonacci Series: ");
     int g = var2.start(1);
     
     for ( g = 1; g<= j; g++)
     {
         System.out.print(n2+" ");
         int next = n1 + n2;
         n1 = n2;
         n2 = next;
     }
	}
}