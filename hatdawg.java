package myprojects;
import java.io.*; import java.util.*; 
public class hatdawg {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
		String [] myArray = {"hello", "hello", "hello", "hello", "hello"}; 
		myArray[0] = "#3110"; myArray[2] = "#3110"; myArray[4] = "#3110";
		System.out.println(myArray[0]); 
		System.out.println(myArray[1]); 
		System.out.println(myArray[2]);
		System.out.println(myArray[3]); 
		System.out.println(myArray[4]);

	}

}

