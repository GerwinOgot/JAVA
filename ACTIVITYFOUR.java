package myprojects;
import java.io.*;
public class ACTIVITYFOUR 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter number of input: ");
		int rows = Integer.parseInt(br.readLine());

	    for (int g = 1; g <= rows; ++g) 
	    {
	    	for (int j = rows; j >= g; j--) 
	    	{ 
                System.out.print(" "); 
            } 
  
            for (int j = 1; j <= g; j++) 
            { 
                System.out.print("* "); 
            } 

            System.out.println(); 
        } 
	}
}
	
