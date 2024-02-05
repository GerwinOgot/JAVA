package myprojects;
import java.util.*;
import java.lang.*;
import java.io.*;
public class longquiz_ogot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a string of your choice: ");
		String input = sc.nextLine();
		byte[] strAsByteArray = input.getBytes();
		 
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        System.out.print("The reverse of the string that you inputted is: ");
        System.out.println(new String(result));
	}

}
