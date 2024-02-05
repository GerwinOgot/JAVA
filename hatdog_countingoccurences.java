package myprojects;

import java.util.Scanner;

public class hatdog_countingoccurences {
	static class NoOfOccurenceOfCharacters {
	    static final int MAX_CHAR = 256;
	 
	    static void getOccuringChar(String str)
	    {
	         
	        // Create an array of size 256
	        // i.e. ASCII_SIZE
	        int count[] = new int[MAX_CHAR];
	 
	        int len = str.length();
	 
	        // Initialize count array index
	        for (int i = 0; i < len; i++)
	            count[str.charAt(i)]++;
	 
	        // Create an array of given String size
	        char ch[] = new char[str.length()];
	        for (int i = 0; i < len; i++) {
	            ch[i] = str.charAt(i);
	            int find = 0;
	            for (int j = 0; j <= i; j++) {
	 
	                // If any matches found
	                if (str.charAt(i) == ch[j])
	                    find++;
	            }
	 
	            if (find == 1)
	                System.out.println(
	                    "Number of Occurrence of "
	                    + str.charAt(i)
	                    + " is:" + count[str.charAt(i)]);
	        }
	    }
	   
	    // Driver Code
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
			System.out.print("Input a string of your choice: ");
			String str = sc.nextLine();
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
