package myprojects;
import java.io.*;
public class ACTIVITY5_OGOT {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("NCR plus Bubble");
		System.out.println("Area 1 - NCR");
		System.out.println("Area 2 - Cavite");
		System.out.println("Area 3 - Laguna");
		System.out.println("Area 4 - Bulacan");
		System.out.println("Area 5 - Rizal");
		System.out.print("Enter case in area 1: ");
		int a1 = Integer.parseInt(br.readLine());
		System.out.print("Enter case in area 2: ");
		int a2 = Integer.parseInt(br.readLine());
		System.out.print("Enter case in area 3: ");
		int a3 = Integer.parseInt(br.readLine());
		System.out.print("Enter case in area 4: ");
		int a4 = Integer.parseInt(br.readLine());
		System.out.print("Enter case in area 5: ");
		int a5 = Integer.parseInt(br.readLine());
		String ecq1 = " ";
		String ecq2 = " ";
		String ecq3 = " ";
		String ecq4 = " ";
		String ecq5 = " ";
		String gcq1 = " ";
		String gcq2 = " ";
		String gcq3 = " ";
		String gcq4 = " ";
		String gcq5 = " ";
		String mgcq1 = " ";
		String mgcq2 = " ";
		String mgcq3 = " ";
		String mgcq4 = " ";
		String mgcq5 = " ";
			  if (a1 >= 100)
		      	{
				  ecq1 = "NCR";
		      	}
		      else if (a1 >= 20)
		      	{
		    	  gcq1 = "NCR";
		      	}
		      else if (a1 >= 0)
		      	{
		    	  mgcq1 = "NCR";
		      	}
					  if (a2 >= 100)
				      	{
						  ecq2 = "Cavite";
				      	}
				      else if (a2 >= 20)
				      	{
				    	  gcq2 = "Cavite";
				      	}
				      else if (a2 >= 0)
				      	{
				    	  mgcq2 = "Cavite";
				      	}
				      if (a3 >= 100)
						      	{
								  ecq3 = "Laguna";
						      	}
						      else if (a3 >= 20)
						      	{
						    	  gcq3 = "Laguna";
						      	}
						      else if (a3 >= 0)
						      	{
						    	  mgcq3 = "Laguna";
						      	}
									  if (a4 >= 100)
									  	{
										  ecq4 = "Bulacan";
									  	}
								      else if (a4 >= 20)
								      	{
								    	  gcq4 = "Bulacan";
								      	}
								      else if (a4 >= 0)
								      	{
								    	  mgcq4 = "Bulacan";
								      	}
											  if (a5 >= 100)
										      	{
												ecq5 = "Rizal";
										      	}
										      else if (a5 >= 20)
										      	{
										    	  gcq5 = "Rizal";
										      	}
										      else if (a5 >= 0)
										      	{
										    	  mgcq5 = "Rizal";
										      	}
		System.out.println("Under ECQ is/are: "+ecq1+ecq2+ecq3+ecq4+ecq5);		
		System.out.println("Under GCQ is/are: "+gcq1+gcq2+gcq3+gcq4+gcq5);	
		System.out.println("Under MGCQ is/are: "+mgcq1+mgcq2+mgcq3+mgcq4+mgcq5);	
		}
}