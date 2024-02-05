package myprojects;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ogot_lquiz {
	static class NoOfOccurenceOfCharacters {
	    static final int MAX_CHAR = 256;
	 
	    static void getOccuringChar(String str)
	    {
	        int count[] = new int[MAX_CHAR];	 
	        int len = str.length();
	        for (int i = 0; i < len; i++)
	            count[str.charAt(i)]++;
	        char ch[] = new char[str.length()];
	        for (int i = 0; i < len; i++) {
	            ch[i] = str.charAt(i);
	            int find = 0;
	            for (int j = 0; j <= i; j++) {
	                if (str.charAt(i) == ch[j])
	                    find++;
	            }	 
	            if (find == 2)
	                System.out.println( str.charAt(i)+ " repeated " + count[str.charAt(i)] + " times");
	        }
	    }
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
			System.out.print("Input a string of your choice: ");
			String str = sc.nextLine();
			 for(int i = 0; i < str.length(); i++){

		            if(str.charAt(i) == ' '){
		           System.out.print("A space is detected! The program will reject the string.");
		           System.exit(0);
		            }
		        }
			byte[] strAsByteArray = str.getBytes();
	        byte[] result = new byte[strAsByteArray.length];
	        for (int i = 0; i < strAsByteArray.length; i++)
	            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
	        System.out.print("The reverse of the string that you inputted is: ");
	        System.out.println(new String(result));
	        getOccuringChar(str);
	    }
	
	}
}