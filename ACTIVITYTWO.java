package myprojects;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ACTIVITYTWO 
{

	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int gr1,gr2,gr3,gr4,gr5;
		System.out.print("Enter your name: ");
		String name = (br.readLine());
		System.out.print("Enter your grade in Math: ");
		gr1 = Integer.parseInt(br.readLine());
		System.out.print("Enter your grade in Filipino: ");
		gr2 = Integer.parseInt(br.readLine());
		System.out.print("Enter your grade in English: ");
		gr3 = Integer.parseInt(br.readLine());
		System.out.print("Enter your grade in Science: ");
		gr4 = Integer.parseInt(br.readLine());
		System.out.print("Enter your grade in P.E.: ");
		gr5 = Integer.parseInt(br.readLine());
		
		double total = (gr1+gr2+gr3+gr4+gr5)/5;
		
		System.out.println(name +" ,ito ang katotohanan");
		System.out.println("Ang iyong GPA ay "+total );
		
		if (total >= 100)
	      {
			System.out.println("ANG GALING MO!!!");
	      }
	      else if (total >= 90)
	      {
	    	  System.out.println("Malupet ka!");
	      }
	      else if (total >= 80)
	      {
	    	  System.out.println("Pasado ka!!");
	      }
	      else if (total >= 70)
	      {
	    	  System.out.println("Safe lang");
	      }
	      else
	      {
	    	  System.out.println("ML pa");
	      }
		
	}

}
