 package myprojects;
import java.util.Scanner;
public class finals_ogot {

    public static void main(String[] args) {

        int input, n1 = 0, n2 = 1;
        System.out.print("Input number of sequences:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
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