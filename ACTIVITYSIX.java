package myprojects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ACTIVITYSIX {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int g = 0;
		System.out.print("Enter array size: ");
		g = Integer.parseInt(br.readLine());
		int [] array = new int[g];
		for(int j = 0; j < array.length; j++)
		{
		System.out.print("Enter element: ");
		array[j] = Integer.parseInt(br.readLine());
		}
		System.out.print("Your array: ");
		for (int j=0; j< array.length; j++)   
		{ 
		System.out.print(array[j]+ " , "); 
		}  

	}

}
